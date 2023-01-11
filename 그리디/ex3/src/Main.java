import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count0 = 0; // 전부 0 으로 바꾸는 경우
        int count1 = 0; // 전부 1 로 바꾸는 경우

        if(s.charAt(0)=='1')
            count0++;
        else count1++;

        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)) {    // 이전 값이 다를때 이전 값과 같은 값으로 만듬
                if (s.charAt(i + 1) == '1') count0++;
                else count1++;
            }
        }
        System.out.println(Math.min(count0,count1));
    }
}