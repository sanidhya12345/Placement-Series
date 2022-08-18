import java.util.Scanner;

public class SubArray {
    private static boolean isSubsequence(int array1[], int array2[])
    {
        int index=0;
        for(int i=0;i<array1.length;i++){
            if(array1[i]==array2[index]){
                index++;
            }
            if(index==array2.length){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length1=sc.nextInt();
        int [] array1=new int[length1];
        for(int i=0;i<array1.length;i++){
            array1[i]=sc.nextInt();
        }
        int length2=sc.nextInt();
        int [] array2=new int[length2];
        for(int j=0;j<length2;j++){
            array2[j]=sc.nextInt();
        }
        System.out.println(isSubsequence(array1,array2));
    }
}
