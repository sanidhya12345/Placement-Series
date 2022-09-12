import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateTheArray {
    public static void leftRotateAnArrayByKtimes(int [] array,int k){
        int count=0;
        while (count<k){
            int index=0;
            int temp=array[index];
            for(int i=1;i<array.length;i++){

                array[i-1]=array[i];
            }
            array[array.length-1]=temp;
            index=index+1;
            count++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while (testcases-- >0){
            int n=sc.nextInt();
            int [] array=new int[n];
            for(int i=0;i<n;i++){
                array[i]=sc.nextInt();
            }
            int k=sc.nextInt();
            leftRotateAnArrayByKtimes(array,k);
            System.out.println(Arrays.toString(array));
        }
    }
}
