import java.util.*;
public class Main {

    static int[][] graph;
    static boolean[][] visited;
    static int n, cnt;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};

    // DFS 탐색
    public static void dfs(int x, int y){
        visited[x][y] = true;
        graph[x][y] = 0;
        cnt++;

        // 위, 아래, 좌, 우 로 탐색
        for(int i=0;i<4;i++){
            int nx = x+dx[i];
            int ny = y+dy[i];

            if(nx>=0 && nx<n && ny>=0 && ny<n){
                if(graph[nx][ny] == 1 && !visited[nx][ny]){
                    dfs(nx,ny);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();

        graph = new int[n][n];
        visited = new boolean[n][n];

        for(int i=0;i<n;i++){
            String str = sc.nextLine();
            for(int j=0;j<n;j++){
                graph[i][j] = str.charAt(j)-'0';
                visited[i][j] = false;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                // 그래프가 1이고 아직 방문하지 않았을 때
                if(graph[i][j] == 1 && !visited[i][j]){
                    cnt = 0;
                    dfs(i,j);
                    result.add(cnt); // cnt 값 리스트에 삽입
                }
            }
        }

        System.out.println(result.size());
        Collections.sort(result); // 오름차순 정렬
        for(int num : result)
            System.out.println(num);
    }
}