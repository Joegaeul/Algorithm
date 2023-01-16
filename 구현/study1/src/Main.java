import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String[] s = sc.nextLine().split(" ");
        int x=1, y=1;

        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};
        char[] dir = {'L','R','U','D'};

        // 이동 계획을 하나씩 확인
        for(int i=0;i<s.length;i++){
            char c = s[i].charAt(0);
            int nx = -1, ny = -1;
            // 이동 후 좌표 구하기
            for(int j=0;j<4;j++){
                if(c == dir[j]) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            // 공간 벗어나는 경우 무시
            if(nx<1||ny<1||nx>n||ny>n) continue;
            // 이동 수행
            x = nx;
            y = ny;
        }
        System.out.println(x+ " "+ y);
    }
}