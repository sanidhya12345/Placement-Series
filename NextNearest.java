import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class NextNearest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    arr[i]=arr[j];
                    break;
                }
                else{
                    continue;
                }
            }
        }
        arr[n-1]=-1;
        System.out.println(Arrays.toString(arr));
    }
}
