import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] arr = new int[26];

        for(int i=0;i<s.length();i++){
            // 대문자일 때
            if('A'<= s.charAt(i) && s.charAt(i)<='Z')
                arr[s.charAt(i)-'A']++;
            // 소문자일 때
            else
                arr[s.charAt(i)-'a']++;

        }

        int max = 0;
        char result = 0;

        for(int i=0;i<26;i++){
            if(arr[i]>max) {
                max = arr[i];
                result = (char)(i+'A'); // 대문자로 출력
            }
            else  if(arr[i]==max)
                result = '?';
        }
        System.out.println(result);
    }
}