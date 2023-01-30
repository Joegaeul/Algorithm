import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<k;i++){
            int n = sc.nextInt();
            // n이 0이 아니면 넣고
            if(n!=0)
                stack.push(n);
            // n이 0이면 이전값을 뺀다 
            else
                stack.pop();
        }

        int result=0;
        for(int i : stack)
            result += i;

        System.out.println(result);

    }
}