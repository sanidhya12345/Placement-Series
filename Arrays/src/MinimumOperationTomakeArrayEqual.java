import java.util.Scanner;

public class MinimumOperationTomakeArrayEqual {
    public static int minOperations(int n) {
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=2*i+1;
        }
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        sum=sum/n;
        int minOperation=0;
        for(int i=0;i<n/2;i++){
            minOperation+=(sum-arr[i]);
        }
        return minOperation;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(minOperations(n));
    }
}
