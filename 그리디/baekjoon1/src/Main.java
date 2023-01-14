import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Integer[] coins = new Integer[n];
        int count = 0;
        for(int i=0;i<n;i++){
            coins[i]=Integer.parseInt(br.readLine());
        }

        Arrays.sort(coins, Collections.reverseOrder()); // 내림차순 정렬

        for(int i=0;i<n;i++){
                count += k/coins[i];  // 동전 개수 합
                k=k%coins[i];         // 나눈 나머지 값
        }
        System.out.println(count);
    }
}