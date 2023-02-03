import java.util.*;
public class Main {

    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public static Queue<Integer> q = new LinkedList<>();
    public static boolean[] visited = new boolean[1001];

    //BFS 이용하여 탐색
    public static void bfs(int v){
        q.offer(v);
        visited[v] = true;

        while(!q.isEmpty()){
            int num = q.poll();
            System.out.print(num+" ");

            for(int i=0;i<graph.get(num).size();i++){
                int nextNode = graph.get(num).get(i);
                if(!visited[nextNode]) {
                    q.offer(nextNode);
                    visited[nextNode] = true;
                }
            }
        }
    }

    // dfs 이용해서 탐색
    public static void dfs(int v){
        visited[v] = true;
        System.out.print(v+" ");

        for(int i=0;i<graph.get(v).size();i++){
            int num = graph.get(v).get(i);

            if(!visited[num]){
                dfs(num);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();

        // 그래프는 1부터 시작하므로 +1더 많이 받아야함
        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<Integer>());
            visited[i] = false;
        }

        // 간선은 양방향이므로
        for(int i=0;i<m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);

        }

        // 정점이 여러 개인 겨우에는 정점 번호가 작은 것을 먼저 방문
        for(int i=0;i<graph.size();i++){
            Collections.sort(graph.get(i));
        }

        dfs(v);

        System.out.println();

        // bfs 실행 전 false로 방문처리
        for(int i=0;i<visited.length;i++)
            visited[i] = false;

        bfs(v);
    }
}