import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        int target = 1;
        for(int i=0;i<n;i++){
            if(target<arr[i]) break;
            target += arr[i];
        }
        System.out.println(target);
    }
}