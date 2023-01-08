import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int groupNum = 0;   // 그룹의 수
        int count = 0;      // 현재 그룹에 포함된 모험가의 수
        int now = 0;
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
            count++;
            if(arr[i]>now) {
                now = arr[i];
            }
            if(count==now){
                groupNum++;
                now = 0;
                count=0;
            }
        }
        System.out.println(groupNum);

        /*
        int n;
        ArrayList<Integer> arrayList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=0;i<n;i++){
            arrayList.add(sc.nextInt());
        }
        Collections.sort(arrayList);

        int result = 0; // 총 그룹의 수
        int count = 0; // 현재 그룹에 포함된 모험가의 수

        for(int i = 0;i<n;i++){
            count+=1;
            if(count>=arrayList.get(i)){
                result +=1;
                count = 0;
            }
        }
        System.out.println(result);
            */
    }
}