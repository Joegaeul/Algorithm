import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList <Character> result = new ArrayList<>();
        int value=0;

        // 문자를 하나씩 확인
        for(int i=0;i<s.length();i++){
            // 알파벳인 경우 리스트에 삽입
            if(Character.isLetter(s.charAt(i))){
                result.add(s.charAt(i));
            }
            // 숫자는 더하기
            else{
                value += s.charAt(i)-'0';
            }
        }

        Collections.sort(result);

        for(int i=0;i<result.size();i++)
            System.out.print(result.get(i));

        if(value!=0)
            System.out.print(value);
        System.out.println();
    }
}