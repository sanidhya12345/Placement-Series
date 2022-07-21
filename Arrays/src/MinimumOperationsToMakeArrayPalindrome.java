import java.util.Scanner;

public class MinimumOperationsToMakeArrayPalindrome {
    private static int findMinimumOperations(int [] array,int n){
        int ans=0;
        for(int i=0,j=n-1;i<=j;){
            if(array[i]==array[j]){
                i++;
                j--;
            }
            else if(array[i]>array[j]){
                j--;
                array[j]+=array[j+1];
                ans++;
            }
            else{
                i++;
                array[i]+=array[i-1];
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println(findMinimumOperations(array,n));
    }
}
