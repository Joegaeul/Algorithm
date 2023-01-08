import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int first = arr[n-1];
        int second = arr[n-2];

        int result = 0;
        int count = 0;

        for(int i=0;i<m;i++){
            if(count==k){
                result +=second;
                count = 0;
            }
            else {
                result += first;
                count++;
            }
        }
        System.out.println(result);

        /*
        int cnt = (m/(k+1))*k; //반복되는 수열 k+1
        cnt += m%(k+1);

        int result = 0;
        result += cnt*first;
        result += (m-cnt)*second;
         */
    }
}