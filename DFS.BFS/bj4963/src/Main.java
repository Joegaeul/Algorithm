import java.util.*;

class Main{

    static int w,h;
    static int[][] map;
    static boolean[][] visited;
    static int cnt;
    static int[] dx = {1,-1,0,0,1,-1,1,-1};
    static int[] dy = {0,0,1,-1,1,-1,-1,1};

    // dfs 탐색 시작
    static void dfs(int x, int y){
        visited[x][y] = true;

        // 상, 하, 좌, 우, 대각선 4곳 까지
        for(int i=0;i<8;i++){
            int nx = x+dx[i];
            int ny = y+dy[i];

            if(nx>=0 && nx<h && ny>=0 && ny<w){
                if(!visited[nx][ny] && map[nx][ny] == 1){
                    dfs(nx,ny);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            w = sc.nextInt(); // 너비
            h = sc.nextInt(); // 높이
            
            // 입력이 0 0 들어오면 그만
            if(w == 0 && h==0)
                break;

            map = new int[h][w];
            visited = new boolean[h][w];
            cnt = 0;

            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    map[i][j] = sc.nextInt();
                }
            }

            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    if(!visited[i][j] && map[i][j] == 1){
                        dfs(i,j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}