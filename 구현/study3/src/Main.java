import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String night = sc.next();

        // 나이트가 이동할 수 있는 8가지 경우의 수
        int[] dx = {-2, -2, 2, 2, -1, -1, 1, 1};
        int[] dy = {-1, 1, -1, 1, -2, 2, -2, 2};

        int ncol = night.charAt(0) - 'a' + 1;
        int nrow = night.charAt(1) - '0';

        // 이동 가능한지 확인
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            int row = nrow + dx[i];
            int col = ncol + dy[i];
            if (row >= 1 && row <= 8 && col >= 1 && col <= 8)
                cnt++;
        }
        System.out.println(cnt);
    }
}

