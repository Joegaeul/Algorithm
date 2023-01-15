import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

        long[] dist = new long[n-1];
        long[] cost = new long[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n-1;i++){
            dist[i]=Long.parseLong(st.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            cost[i]=Long.parseLong(st2.nextToken());
        }

        // 적은 비용 * 거리 의 합 구하기 
        long sum = 0;
        long mincost=cost[0];
        for(int i=0;i<n-1;i++){
            if(cost[i]<mincost)
                mincost = cost[i];
            sum += mincost*dist[i];
        }
        System.out.println(sum);
    }
}