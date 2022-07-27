import java.util.Scanner;

public class CheckIfTwoSTringsAreRotationOfEachOther {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        if(s1.length()==s2.length() && (s1 + s2).contains(s2)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
