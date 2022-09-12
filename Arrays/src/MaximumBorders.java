import java.util.Scanner;

public class MaximumBorders {
    private static int maximumBorders(char [][] matrix,int n,int m){
        int ans=0;
        for(int i=0;i<n;i++){
            int count_hash=0;
            for (int j = 0; j <m ; j++) {
                if(matrix[i][j]=='#'){
                    count_hash++;
                }
            }
            ans=Math.max(ans,count_hash);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while (testcases-->0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String[] array = new String[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.next();
            }

            char [][] matrix=new char[n][m];
            for(int i=0;i<n;i++){
                matrix[i]=array[i].toCharArray();
            }
            System.out.println(maximumBorders(matrix,n,m));
        }
    }
}
