import java.util.Arrays;
import java.util.Scanner;

public class LunchBoxes {
    private static int maximumLunchBoxesDeliver(int []array,int boxes){
        Arrays.sort(array);
        int sum=0;
        int count=0;
        for (int j : array) {
            sum += j;
            if (sum <= boxes) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while (testcases-->0){
            int boxes=sc.nextInt();
            int schools=sc.nextInt();
            int [] arrayofschools=new int[schools];
            for(int i=0;i<schools;i++){
                arrayofschools[i]=sc.nextInt();
            }
            System.out.println(maximumLunchBoxesDeliver(arrayofschools,boxes));
        }
    }
}
