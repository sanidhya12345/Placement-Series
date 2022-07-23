import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {
    private static boolean isValidAnagram(String s,String t){
        char [] array1=s.toCharArray();
        char [] array2=t.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        String news=new String(array1);
        String newt=new String(array2);
        return news.equals(newt);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        System.out.println(isValidAnagram(s,t));
    }
}
