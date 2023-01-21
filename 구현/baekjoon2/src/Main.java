import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] cro = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        Scanner sc= new Scanner(System.in);
        String word = sc.next();

        for(int i=0;i<cro.length;i++){
            // word가 크로아티아 알파벳을 포함하고 있으면
            if(word.contains(cro[i])){
                word = word.replace(cro[i],"o");
            }
        }
        System.out.println(word.length());
    }
}