import java.util.*;
public class Main {

    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public static boolean[] visited = new boolean[101];
    public static int cnt;

    // DFS 탐색
    public static int dfs(int num){
        visited[num] = true;

        for(int i=0;i<graph.get(num).size();i++){
            int nextNum = graph.get(num).get(i);
            // 방문하지 않았으면 바이러스에 걸리게 되는 컴퓨터의 수 증가 시키고 dfs 수행
            if(!visited[nextNum]){
                cnt++;
                dfs(nextNum);
            }
        }
        return cnt;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i=0;i<m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        System.out.println(dfs(1)); // 1부터 시작
    }
}