import java.util.Scanner;

public class ArrangingCoins {
    public static int arrangeCoins(int n) {
        long count= (-1 + ((long)Math.sqrt(1+4*2.0*n)))/2;
        return Long.valueOf(count).intValue();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(arrangeCoins(n));
    }
}
