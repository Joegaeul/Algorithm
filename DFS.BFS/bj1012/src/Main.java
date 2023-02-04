import java.util.*;
public class Main {

    static int t, n, m, k, cnt;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};

    // DFS 탐색
    static void dfs(int x, int y) {
        visited[x][y] = true;

        // 상, 하, 좌, 우로 탐색
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
                if (graph[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        for(int i=0;i<t;i++){
            m = sc.nextInt();
            n = sc.nextInt();
            k = sc.nextInt();

            graph = new int[m][n];
            visited = new boolean[m][n];
            cnt = 0;

            for(int j=0;j<k;j++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                graph[a][b] = 1;
            }

            for(int j=0;j<m;j++){
                for(int p=0;p<n;p++){
                    // 그래프가 1이고 방문하지 않았을때
                    if(graph[j][p] ==1 && !visited[j][p]) {
                        dfs(j,p);
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }
    }
}