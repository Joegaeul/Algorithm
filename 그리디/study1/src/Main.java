import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 1260;
        int[] arr = {500,100,50,10};
        int count =0;

        for(int i=0;i<arr.length;i++){
            count += n/arr[i];
            n %= arr[i];
        }
        System.out.println(count);
    }
}