import java.util.*;
public class Main {

    static int r,c;
    static char[][] map; // 알파벳이 존재하는 위치
    static boolean[] visited; // 알파벳이 쓰였는지
    static int result;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};

    static void dfs(int x, int y, int cnt){
        visited[map[x][y]-'A'] = true; // 알파벳 방문 처리
        result = Math.max(result,cnt);
        
        // 4방향으로 방문 시작
        for(int i=0;i<4;i++){
            int nx = x+dx[i];
            int ny = y+dy[i];

            if(nx>=0 && nx<r && ny>=0 && ny<c){
                int num = map[nx][ny]-'A';
                if(!visited[num]){
                    dfs(nx,ny,cnt+1);
                    visited[num] = false; // 알파벳 미방문 처리
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();
        sc.nextLine();

        map = new char[r][c];
        visited = new boolean[26];

        for(int i=0;i<r;i++){
            String str = sc.nextLine();
            for(int j=0;j<c;j++){
                map[i][j] = str.charAt(j);
            }
        }

        dfs(0,0,1); // 처음꺼 포함이니깐 cnt 1로 시작
        System.out.println(result);
    }
}