
import java.util.ArrayList;
import java.util.Scanner;

public class ReeverseAString {
    private static String rev(String s){
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString();
    }
    private static String reverse(String [] array){
        ArrayList<String> s=new ArrayList<>();
        for(String i:array){
            s.add(rev(i));
        }
        String ans="";
        for(String i:s){
            ans+=i+" ";
        }
        return ans.trim();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String [] array=s.split(" ");
        System.out.println(reverse(array));
    }
}
