import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum1=0,sum2=0;

        // 왼쪽 부분의 자릿수의 합 더하기
        for(int i=0;i<s.length()/2;i++){
            sum1 += s.charAt(i)-'0';
        }

        // 오른쪽 부분의 자릿수의 합 더하기
        for(int i=s.length()/2;i<s.length();i++){
            sum2 += s.charAt(i)-'0';
        }

        // 왼쪽 부분과 오른쪽 부분의 자릿수의 합이 동일한지 검사
        if(sum1==sum2)
            System.out.println("LUCKY");
        else System.out.println("READY");
    }
}