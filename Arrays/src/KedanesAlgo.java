import java.util.Scanner;

public class KedanesAlgo {
    private static int largestContigousSum(int [] array,int n){
        //Step1:- Initialise necessary variable.
        int max_so_far=Integer.MIN_VALUE;
        int max_ending_here=0;

        //Step2:- Loop through each element of array.
        for(int i=0;i<n;i++){
            max_ending_here+=array[i];
            if(max_so_far<max_ending_here){
                max_so_far=max_ending_here;
            }
            if(max_ending_here<0){
                max_ending_here=0;
            }
        }
        return max_so_far;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int [] array=new int[length];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println(largestContigousSum(array,length));
    }
}
