import java.util.*;
public class Main {
    static int n,m;
    static int[][] graph;
    static boolean visited[];

    // DFS탐색 시작
    static void dfs(int x){
        visited[x] = true;

        for(int i=1;i<=n;i++){
            if( graph[x][i] == 1 && !visited[i]){
                dfs(i);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        graph = new int[n+1][n+1];
        visited = new boolean[n+1];


        for(int i=0;i<m;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            // 방향 없는 그래프이므로
            graph[u][v] = 1;
            graph[v][u] = 1;
        }

        int cnt = 0;

        for(int i=1;i<n+1;i++) {
            // i번째를 방문하지 않았을 때
            if(!visited[i]){
                dfs(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}