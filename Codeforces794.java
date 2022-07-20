import java.util.Scanner;

public class Codeforces794 {
    private static boolean helper(int [] array){
        double sum=0;
        for (int k : array) {
            sum += k;
        }
        for (int j : array) {
            if (sum / array.length == j) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases--!=0){
            int length=sc.nextInt();
            int [] array=new int[length];
            for(int i=0;i<length;i++){
                array[i]=sc.nextInt();
            }
            boolean flag=helper(array);
            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}
