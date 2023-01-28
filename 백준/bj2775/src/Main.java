import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[][] apt = new int[15][15];

        for(int i=0;i<15;i++){
            apt[0][i]=i; // 0층은 i호에 i명이 산다
            apt[i][1]=1; // 1호는 항상 1명 산다
        }

        for(int i=1;i<15;i++){
            for(int j=2;j<15;j++){
                apt[i][j] = apt[i][j-1]+apt[i-1][j]; // i층의 j-1호 + i-1층의 j층
            }
        }

        for(int i=0;i<t;i++){
            int k = sc.nextInt();
            int n = sc.nextInt();

            System.out.println(apt[k][n]);
        }
    }
}