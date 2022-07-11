import java.util.Arrays;
import java.util.Scanner;

/*
* Given an array of n integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that:

1.Each student gets one packet.
2. The difference between the number of chocolates in the packet with maximum chocolates and packet with minimum chocolates given to the students is minimum.
* */
public class ChocolateDistribution {
    private static int findMinDiff(int [] packets,int n,int m){
        if(m==0 || n==0) return 0;
        if(n<m) return -1;
        Arrays.sort(packets);
        int min_diff=Integer.MAX_VALUE;
        for(int i=0;i+m-1<n;i++){
            int diff=packets[i+m-1]-packets[i];
            if(diff<min_diff){
                min_diff=diff;
            }
        }
        return min_diff;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [] packets=new int[n];
        for(int i=0;i<n;i++){
            packets[i]=sc.nextInt();
        }
        System.out.println(findMinDiff(packets,n,m));
    }
}
