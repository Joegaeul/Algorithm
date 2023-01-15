import java.util.*;
import java.io.*;
public class Main {
    static long ans = Integer.MAX_VALUE;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 뺄셈을 기준으로 분리
        StringTokenizer st = new StringTokenizer(br.readLine(),"-");

        while(st.hasMoreTokens()){
            String s= st.nextToken();
            // 뺄셈으로 나뉜 토큰을 덧셈으로 분리하여 해당 토큰들을 더한다.
            StringTokenizer st2 = new StringTokenizer(s,"+");
            int sum = 0;
            while(st2.hasMoreTokens()){
                sum+=Integer.parseInt(st2.nextToken());
            }
        // 첫번째 토큰은 더해줘야함
        if(ans == Integer.MAX_VALUE)
            ans = sum;
        else
            ans -=sum;
        }
        System.out.println(ans);
    }
}