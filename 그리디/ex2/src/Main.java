import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringTokenizer st = new StringTokenizer(s);
        long sum = 0;
        for(int i=0;i<s.length();i++){
            int n = s.charAt(i)-'0';
            if(n<=1||sum<=1) // 두 수 중에서 하나라도 0,1인 경우 더하기 수행
                sum += n;
            else
                sum *= n;
        }
        System.out.println(sum);
    }
}