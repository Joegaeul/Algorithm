import java.util.*;
public class Main {

    static int n;
    static char[][] graph;
    static boolean[][] visited;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();

        graph = new char[n][n];
        visited = new boolean[n][n];

        for(int i=0;i<n;i++){
            String str = sc.nextLine();
            for(int j=0;j<n;j++){
                graph[i][j] = str.charAt(j);
            }
        }

        // 정상인 경우
        int cnt = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j]) {
                    dfs(i, j);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

        // 비정상인 경우
        // 값들 초기화
        cnt = 0;
        visited = new boolean[n][n];
        // 'G'를 'R'로 바꿔줌
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(graph[i][j]=='G')
                    graph[i][j] = 'R';
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j]) {
                    dfs(i, j);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    // DFS 탐색
    static void dfs(int x, int y){
        visited[x][y] = true;
        char temp = graph[x][y];

        for(int i=0;i<4;i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                if (graph[nx][ny]==temp && !visited[nx][ny])
                    dfs(nx, ny);
            }
        }
    }
}