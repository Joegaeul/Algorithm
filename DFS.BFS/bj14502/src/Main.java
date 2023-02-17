import java.util.*;
public class Main {

    static int N,M;
    static int map[][];
    static int copyMap[][];
    static int result_cnt = Integer.MIN_VALUE;
    static int [] dx = {0,0,1,-1};
    static int [] dy = {1,-1,0,0};

    static class Node{
        int x,y;

        public Node(int x, int y){
            this.x=x;
            this.y=y;
        }
    }

    // 벽세우기
    static void dfs(int cnt){
        // 벽 3개 다 세우면 바이러스 확산 시키기
        if(cnt ==3){
            bfs();
        }
        else{
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    if(map[i][j] == 0){
                        map[i][j] = 1;
                        dfs(cnt+1);
                        map[i][j] = 0;
                    }
                }
            }
        }
    }

    // 바이러스 퍼뜨리기
    static void bfs(){
        Queue<Node> q = new LinkedList<>();
        copyMap= new int[N][M];

        // 벽이 세워진 map을 copyMap으로 복사
        // 바이러스 위치 큐에 삽입
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                copyMap[i][j] = map[i][j];
                if(copyMap[i][j]==2)
                    q.offer(new Node(i,j));
            }
        }

        while(!q.isEmpty()){
            Node node = q.poll();
            for(int i=0;i<4;i++){
                int nx = node.x+dx[i];
                int ny = node.y+dy[i];

                if(nx>=0 && nx<N && ny>=0 && ny<M){
                    if(copyMap[nx][ny] == 0){
                        copyMap[nx][ny] = 2;
                        q.offer(new Node(nx,ny));
                    }
                }
            }
        }

        int cnt = 0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(copyMap[i][j] == 0)
                    cnt++;
            }
        }
        result_cnt = Math.max(result_cnt,cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 세로 크기
        M = sc.nextInt(); // 가로 크기

        map = new int[N][M];

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                map[i][j] = sc.nextInt();
            }
        }

        dfs(0);
        System.out.println(result_cnt);
    }
}