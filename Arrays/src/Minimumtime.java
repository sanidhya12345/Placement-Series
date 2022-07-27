import java.util.Arrays;

public class Minimumtime {
    public static void main(String[] args) {
        int [] array={5,0,0};
        int sum=array[0]+array[1]+array[2];
        int max=array[0];
        for(int i=1;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        if(sum-max<=max){
            System.out.println(max);
        } else if (sum %2==0) {
            System.out.println(sum/2);
        }
        else{
            System.out.println((sum/2)+1);
        }
    }
}
