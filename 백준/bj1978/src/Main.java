import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for(int i=0;i<n;i++){
            // 소수인경우 true, 아닌경우 false
            boolean isPrime = true;
            int num = sc.nextInt();

            if(num == 1) // 1 인경우 소수가 아니므로 다음 반복문으로
                continue;

            for(int j=2;j<num;j++){
                if(num%j==0){
                    isPrime = false; // 소수가 아니므로 false 로 바꿔줌
                    break;
                }
            }
            if(isPrime){ // 소수인경우 cnt 값 1 증가
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}