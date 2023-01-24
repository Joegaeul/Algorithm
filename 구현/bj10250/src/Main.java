import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            int[] arr= new int[10000];
            int cnt = 0;
            for(int j=1;j<=w;j++){
                for(int k=1;k<=h;k++){
                    arr[cnt]=k*100+j;
                    cnt++;
                }
            }
            System.out.println(arr[n-1]);
        }
    }
}