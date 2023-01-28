import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 4 || n==7){
            System.out.println(-1);
        }
        else if(n%5 == 0){ // 5 10 15 20 ...
            System.out.println(n/5);
        }
        else if(n%5 ==1 || n%5 ==3){ // 6 8 11 13 16 18..
            System.out.println((n/5)+1);
        }
        else if(n%5 ==2 || n%5 ==4){ // 7 9 12 14 17 19..
            System.out.println((n/5)+2);
        }
    }
}