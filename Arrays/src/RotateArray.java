import java.util.Arrays;

public class RotateArray {


    private  static void reverse(int []arr,int start, int end){
        int j = end-1;
        for(int i= start;i<j;i++){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            j--;
        }
    }
    public static void main(String[] args) {
        int [] array={-1,-100,3,99};
        int k=2;
        int n = array.length;
        int d= k%n;
       reverse(array,0,n-d);
       reverse(array, n-d,n);
       reverse(array,0,n);
        System.out.println(Arrays.toString(array));
    }
}
