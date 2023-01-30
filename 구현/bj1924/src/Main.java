import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] dayOfWeek = {"SUN","MON","TUE","WED","THU","FRI","SAT"};

        int day = y;
        for(int i=0;i<x-1;i++){
            day += dayOfMonth[i]; // x월 y일을 일로 계산
        }
        System.out.println(dayOfWeek[day%7]); 
    }
}