import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Integer []a = new Integer[N];
        Integer []b = new Integer[N];

        for(int i=0;i<N;i++){
            a[i] = sc.nextInt();
        }

        for(int i=0;i<N;i++){
            b[i] = sc.nextInt();
        }

        Arrays.sort(a); // 오름차순 정렬
        Arrays.sort(b, Collections.reverseOrder()); // 내림차순 정렬

        // a와 b배열 앞쪽 3개 교체
        for(int i=0;i<3;i++){
            a[i] = b[i];
        }

        int sum = 0;
        for(int num : a)
            sum += num;

        System.out.println(sum);
    }
}