import java.util.*;
public class Main {

    static int M,N,H;
    static int map[][][];
    static Queue<Node> q = new LinkedList<>();
    static int result=Integer.MIN_VALUE;
    static int dx[] = {1,-1,0,0,0,0};
    static int dy[] = {0,0,1,-1,0,0};
    static int dz[] = {0,0,0,0,1,-1};

    static class Node{
        int x,y,z;

        public Node(int x, int y , int z){
            this.x=x;
            this.y=y;
            this.z=z;
        }
    }

    // 토마토가 모두 익을 때까지 최소 일수 구하기
    static int bfs(){
        while(!q.isEmpty()){
            Node node = q.poll();

            for(int i=0;i<6;i++){
                int nx = node.x+dx[i];
                int ny = node.y+dy[i];
                int nz = node.z+dz[i];

                if(nx>=0 && nx<H && ny>=0 && ny<N && nz>=0 && nz<M){
                    if(map[nx][ny][nz] == 0){
                        map[nx][ny][nz] = map[node.x][node.y][node.z]+1;
                        q.offer(new Node(nx,ny,nz));
                    }
                }
            }
        }
        for(int i=0;i<H;i++){
            for(int j=0;j<N;j++){
                for(int k=0;k<M;k++){
                    // 하나라도 안익은 토마토가 있으면 -1
                    if(map[i][j][k] == 0) {
                        return -1;
                    }
                    result = Math.max(result,map[i][j][k]);
                }
            }
        }
        // 저장될 떄부터 모든 토마토가 익어있는 상태
        if(result == 1) return 0;
        // 최소 일수
        return result-1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt(); // 상자의 가로 칸의 수
        N = sc.nextInt(); // 상자의 세로 칸의 수
        H = sc.nextInt(); // 상자의 수

        map = new int[H][N][M];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    map[i][j][k] = sc.nextInt();
                    if (map[i][j][k] == 1)
                        q.offer(new Node(i, j, k));
                }
            }
        }
        System.out.println(bfs());
    }
}