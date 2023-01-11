import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[11];
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            arr[x]++;
        }

        int result = 0;
        for(int i=1;i<=m;i++){
            n = n - arr[i]; // 무게가 i인 볼링공의 개수 제외
            result += arr[i]*n; // a선택 경우의 수 * b선택 경우의 수
        }
        System.out.println(result);
    }
}