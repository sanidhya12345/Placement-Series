import java.util.Scanner;

public class MinimumAndMaximumOfArray {
    private static int minimum(int [] array){
        int minimum=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]<minimum){
                minimum=array[i];
            }
        }
        return minimum;
    }
    private static int maximum(int [] array){
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>maximum){
                maximum=array[i];
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int [] array=new int[length];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println(minimum(array));
        System.out.println(maximum(array));
    }
}
