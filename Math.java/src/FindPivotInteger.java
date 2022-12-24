import java.util.Scanner;

public class FindPivotInteger {
    public static int pivotInteger(int n) {
        int a=((n)*(n+1))/2;

        int pivot=(int)Math.sqrt(a);
        int sum= ((pivot)*(pivot+1)) /2;

        if(sum==(a-sum+pivot))
            return pivot;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(pivotInteger(n));
    }
}
