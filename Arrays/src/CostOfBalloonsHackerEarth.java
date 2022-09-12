import java.util.Scanner;

public class CostOfBalloonsHackerEarth {
    private static int minimumCost(int [][] solve,int green,int purple,int n){
        int count_1=0;
        int count_2=0;

        for(int i=0;i<n;i++){
            if(solve[i][0]==1) count_1++;
        }
        for(int j=0;j<n;j++){
            if(solve[j][1]==1) count_2++;
        }
        int ans=Math.min(count_1,count_2)*Math.max(green,purple)+Math.max(count_1,count_2)*Math.min(green,purple);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while (testcases-->0){
            int green=sc.nextInt();
            int purple= sc.nextInt();
            int n=sc.nextInt();
            int [][] solve=new int[n][2];
            for(int i=0;i<n;i++){
                solve[i][0]=sc.nextInt();
                solve[i][1]=sc.nextInt();
            }
            System.out.println(minimumCost(solve,green,purple,n));
        }
    }
}
