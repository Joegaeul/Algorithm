import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int sum = 0; // 소수 합
        int min = Integer.MAX_VALUE; // 소수 최소값

        for(int i=m;i<=n;i++){
            boolean empty = true;
            if(i==1)
                continue;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    empty=false;
                }
            }
            if(empty==true) { // 소수 라면 더해주고 min 이 Integer.MAX_VALUE 일때만 즉 처음에만
                sum += i;
                if(min == Integer.MAX_VALUE)
                    min = i;
            }
        }

        if(sum==0){ // 소수가 없다면
            System.out.println(-1);
        }
        else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}