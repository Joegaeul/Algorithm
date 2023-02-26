import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer []arr = new Integer[n];

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr, Collections.reverseOrder()); // 내림차순 정렬

        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}