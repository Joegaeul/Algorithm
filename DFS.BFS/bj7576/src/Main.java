import java.util.*;
public class Main {

    static int m,n;
    static int graph[][];
    static int cnt=0;
    static int dx[] = {0,0,1,-1};
    static int dy[] = {1,-1,0,0};
    static Queue<Node> q;

    static class Node{
        int x,y;
        public Node(int x, int y){
            this.x=x;
            this.y=y;
        }
    }

    static void bfs(){
        while(!q.isEmpty()){
            Node node = q.poll();

            //상,하,좌,우 로 탐색 시작
            for(int i=0;i<4;i++){
                int nx = node.x+dx[i];
                int ny = node.y+dy[i];

                if(nx>=0 && nx<n && ny>=0 && ny<m){
                    if(graph[nx][ny] == 0){
                        graph[nx][ny] = graph[node.x][node.y] + 1;
                        q.offer(new Node(nx,ny));
                    }
                }
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        m = sc.nextInt(); //상자 가로 칸의 수
        n = sc.nextInt(); //상자 세로 칸의 수

        graph = new int[n][m];
        q = new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                graph[i][j] = sc.nextInt();
                //익은 토마토는 큐에 넣음
                if(graph[i][j] == 1)
                    q.add(new Node(i,j));
            }
        }

        bfs();

        int result = 0; // 최소 날짜
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                // 익지 못한 토마토가 있으면 -1
                if(graph[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                result = Math.max(result,graph[i][j]);
            }
        }
        System.out.println(result-1);
    }
}