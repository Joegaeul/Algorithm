import java.util.*;
public class Main {
   public static Scanner sc = new Scanner(System.in);
    public static boolean check(){
        String word = sc.next();
        boolean[] check = new boolean[26];
        int prev = 0;

        for(int i=0;i<word.length();i++){
            int now = word.charAt(i);
            // 이전 단어와 현재단어가 다를 때
            if(prev != now){
                // 처음 나온 알파벳일 때
                if(check[now-'a']==false){
                    check[now-'a']=true;
                    prev = now;
                }
                // 이미 나온 알파벳일 때
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        int cnt =0;
        for(int i=0;i<n;i++){
            if(check() == true) // 그룹단어 확인
                cnt++;
        }
        System.out.println(cnt);
    }
}