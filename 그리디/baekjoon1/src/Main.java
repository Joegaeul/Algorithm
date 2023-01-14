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
        Arrays.sort(coins, Collections.reverseOrder());
        for(int i=0;i<n;i++){
            count += k/coins[i];
            k=k%coins[i];
        }
        System.out.println(count);
    }
}