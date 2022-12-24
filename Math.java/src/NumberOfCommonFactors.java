import java.util.Scanner;

public class NumberOfCommonFactors {
    public static int commonFactors(int a, int b) {
        int count=0;
        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0) count++;
        }
        return count;
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
        System.out.println(commonFactors(a,b));
    }
}