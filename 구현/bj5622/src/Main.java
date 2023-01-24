import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String[] arr = {"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        int cnt = 0;

        for(int i=0;i<s.length();i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j].indexOf(s.charAt(i))!=-1){ // 문자열에 문자 포함 확인
                    cnt += j+1;
                }
            }
        }
        System.out.println(cnt);
    }
}