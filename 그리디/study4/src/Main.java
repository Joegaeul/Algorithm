import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 0;
        while(n!=1) {
            if (n % k == 0) {
                n /= k;
            } else {
                n -= 1;
            }
            count++;
        }
        System.out.println(count);
        /*
        int result = 0;
        while(true){
            int target = (n/k)*k;
            result += (n-target);
            n = taget;
            if(n<k) break;
            result+=1;
            n/=k;
        }
        result+=(n-1);
        System.out.println(result);
        */
    }
}