import java.util.*;

class Main{
    static int n, m;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};

    static class Node{
        int x,y;

        public Node(int x, int y){
            this.x=x;
            this.y=y;
        }
    }

    static void bfs(int x, int y){
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x, y));
        visited[x][y] = true;

        // 큐가 비어있지 않으면 상,하,좌,우로 탐색
        while(!q.isEmpty()){
            Node node = q.poll();

            for(int i=0;i<4;i++){
                int nx = node.x+dx[i];
                int ny = node.y+dy[i];

                if(nx>=0 && nx<n && ny>=0 && ny<m){
                    if(!visited[nx][ny] && graph[nx][ny] == 1){
                        q.offer(new Node(nx,ny));
                        graph[nx][ny] = graph[node.x][node.y]+1;
                        visited[nx][ny] = true;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        graph = new int[n][m];
        visited = new boolean[n][m];

        for(int i=0;i<n;i++){
            String str = sc.nextLine();
            for(int j=0;j<m;j++){
                graph[i][j] = str.charAt(j)-'0';
            }
        }

        bfs(0,0);
        System.out.println(graph[n-1][m-1]);
    }
}