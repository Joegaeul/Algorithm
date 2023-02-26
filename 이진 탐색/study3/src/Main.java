import java.util.*;
public class Main {
    // 이진 탐색 구현(반복문)
    public static int binarySearch(int []arr, int target, int start, int end){
        while(start<=end){
            int mid = (start+end)/2;
            // 찾은 경우 중간점 인덱스 반환
            if(arr[mid]==target) return mid;
            // 중간점의 값보다 찾고자 하는 값이 작은 경우 왼쪽 확인
            else if(arr[mid]>target) end = mid - 1;
            // 중간점의 값보다 찾고자 하는 값이 큰 경우 오른쪽 확인
            else start = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();

        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int result = binarySearch(arr,target,0,n-1);
        if(result == -1)
            System.out.println("원소가 존재하지 않습니다");
        else
            System.out.println(result+1);
    }
}