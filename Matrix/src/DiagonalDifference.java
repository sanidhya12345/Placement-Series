import java.util.Scanner;

public class DiagonalDifference {

    private static int absoluteDiagonalSumDifference(int [][] matrix,int n){

        int dia1=0;
        int dia2=0;

        for(int i=0;i<n;i++){
            dia1+=matrix[i][i];
        }
        int k=0;
        for(int i=n-1;i>=0;i--){
            dia2+=matrix[i][k];
            k++;
        }
        return Math.abs(dia1-dia2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][] matrix=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println(absoluteDiagonalSumDifference(matrix,n));
    }
}
