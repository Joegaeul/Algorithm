import java.util.*;

class Student implements Comparable<Student>{
    private String name;
    private int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName(){
        return this.name;
    }

    public int getScore(){
        return this.score;
    }

    // 정렬 기준은 점수가 낮은 순서
    public int compareTo(Student student){
        // 자신보다 상대방이 크면 -1, 자신보다 상대방이 작으면 1
        if(this.score < student.score){
            return -1;
        }
        return 1;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        List<Student> students = new ArrayList<>();
        for(int i=0;i<n;i++){
            String name = sc.next();
            int score = sc.nextInt();
            students.add(new Student(name, score));
        }

        Collections.sort(students);

        for(int i=0;i<students.size();i++){
            System.out.print(students.get(i).getName()+" ");
        }
    }
}