import java.util.Arrays;
import java.util.Scanner;

public class CheckTheValueOKTimesRotatedArray {
    private static int checkValueOfTimesRotation(int [] array){
        int count=0;
        for(int i=1;i<array.length;i++){
            if(array[i-1]<array[i]) count++;
        }

        if(count==array.length){
            return 0;
        }
        int index=0;
        for(int i=1;i<array.length;i++){
            if(array[i-1]>array[i]){
                index=i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while (testcases-- >0){
            int len=sc.nextInt();
            int [] array=new int[len];
            for(int i=0;i<len;i++){
                array[i]=sc.nextInt();
            }
            System.out.println(checkValueOfTimesRotation(array));
        }
    }
}
