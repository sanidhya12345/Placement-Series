import java.util.Arrays;

public class ReverseAnArrayInConstantSpace {
    public static void reverse(int [] array){
        int start=0;
        int end= array.length-1;
        while (start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
