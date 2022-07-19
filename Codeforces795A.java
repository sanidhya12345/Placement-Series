import java.util.Scanner;

public class Codeforces795A {
    private static int solve(int [] array,int length){
        int countoddvalues=0;
        for(int i=0;i<length;i++){
            if(array[i]%2==0){
                countoddvalues++;
            }
        }
        return Math.min(countoddvalues,length-countoddvalues);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while (testcases--!=0){
            int length=sc.nextInt();
            int [] array=new int[length];
            for(int i=0;i<array.length;i++){
                array[i]=sc.nextInt();
            }
            System.out.println(solve(array,length));
        }
    }
}
