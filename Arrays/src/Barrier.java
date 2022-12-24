import java.util.Arrays;

import java.util.Scanner;


public class Barrier {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][] barrier=new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                barrier[i][j]=sc.nextInt();
            }
        }
        Arrays.sort(barrier, (o1, o2) -> Integer.compare(o2[0], o1[0]));
        int prev_end = barrier[0][0] - 1;

        int count = 0;
        for (int i=0; i<n; i++)
        {
            if (prev_end < barrier[i][0])
            {
                count += (barrier[i][1]- barrier[i][0] + 1);
                prev_end = barrier[i][1];
            }
            else if (prev_end < barrier[i][1])
            {
                count += (barrier[i][1] - prev_end);
                prev_end = barrier[i][1];
            }
        }
        System.out.println(count);
    }
}
