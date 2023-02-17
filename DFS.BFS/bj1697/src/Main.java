import java.util.*;

public class Main
{
    static int N; //수빈이가 있는 위치
    static int K; //동생이 있는 위치

    static int visited[] = new int[100001];

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        N= sc.nextInt();
        K= sc.nextInt();

        int result = bfs(N);
        System.out.println(result);
    }

    private static int  bfs(int node)
    {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.offer(node);
        int index = node;
        int n = 0;
        visited[index] = 1;
        while (!queue.isEmpty())
        {
            n = queue.poll();

            // 수빈이가 있는 위치일 경우
            if (n == K)
            {
                return visited[n]-1;
            }
            // n-1인 경우
            if (n-1>=0 && visited[n-1] == 0)
            {
                visited[n-1] = visited[n]+1;
                queue.offer(n-1);
            }
            // n+1인 경우
            if (n+1 <= 100000 && visited[n+1] == 0)
            {
                visited[n+1] = visited[n]+1;
                queue.offer(n+1);
            }
            // 2*n인 경우
            if (2*n <= 100000 && visited[2*n] == 0)
            {
                visited[2*n] = visited[n] + 1;
                queue.offer(2*n);
            }
        }
        return -1;
    }
}