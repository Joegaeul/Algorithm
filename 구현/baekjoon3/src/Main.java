import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for(int i=0;i<n;i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int[] rank = new int[n];
        int cnt = 0;

        // 자신보다 키와 몸무게가 둘다 크면 cnt++
        for(int i=0;i<n;i++){
            cnt = 1;
            for(int j=0;j<n;j++){
                if(x[i]<x[j] && y[i]<y[j]){
                    cnt++;

                }
            }
            rank[i] = cnt;
        }
        for(int i=0;i<rank.length;i++){
            System.out.println(rank[i]);
        }
    }
}