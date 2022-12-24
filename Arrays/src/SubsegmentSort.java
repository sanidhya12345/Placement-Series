import java.util.Scanner;

public class SubsegmentSort {
    private static int findMaxSubsegmentCount(int[] arr)
    {
        int n = arr.length;
        int[] right_min = new int[n + 1];
        right_min[n] = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            right_min[i] = Math.min(right_min[i + 1], arr[i]);
        }

        int partitions = 0;
        for (int current_max = arr[0], i = 0; i < n; i++) {
            current_max = Math.max(current_max, arr[i]);
            if (current_max <= right_min[i + 1])
                partitions++;
        }

        return partitions;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(findMaxSubsegmentCount(arr));
    }
}
