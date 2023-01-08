 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        int [][] arr = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int result = 0;
        for(int i=0;i<n;i++){
            int min = arr[i][0];
            for(int j=0;j<m;j++){
                min = Math.min(min,arr[i][j]);
            }
            result = Math.max(min,result);
        }
        System.out.println(result);
        /*
        int result =0;
        for(int i=0;i<n;i++){
            int min = 10001;
            for(int j=0;j<m;j++){
                int x = sc.nextInt();
                min = Math.min(min,x);
            }
            result = Math.max(result,min);
        }
        System.out.println(result);
        */
    }
}