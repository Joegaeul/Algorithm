import java.util.*;
public class Main {

    static int n;
    static int[][] map;
    static boolean[][] visited;
    static int cnt, result_cnt;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};

    // dfs 탐색
    static void dfs(int x, int y, int height){
        visited[x][y] = true;

        for(int i=0;i<4;i++){
            int nx = x+dx[i];
            int ny = y+dy[i];

            if(nx>=0 && nx<n && ny>=0 && ny<n){
                if(!visited[nx][ny] && map[nx][ny] > height)
                    dfs(nx,ny,height);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        map = new int[n][n];
        int max=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                map[i][j] = sc.nextInt();
                max = Math.max(max, map[i][j]); // 최대 높이
            }
        }

        // 모든 높이 경우의 수
        for(int i=0;i<=max;i++){
            visited = new boolean[n][n];
            cnt = 0;
            for(int j=0;j<n;j++) {
                for (int k = 0; k < n; k++) {
                    // 아직 방문하지 않았고 i보다 크면 안전한 영역
                    if (!visited[j][k] && map[j][k] > i){
                        dfs(j, k, i);
                        cnt++;
                    }
                }
            }
            result_cnt = Math.max(cnt, result_cnt); // 최대 개수 계산
        }
        System.out.println(result_cnt);
    }
}