import java.util.*;

public class MaximumProductDifferenceBetweenTwoPairs {
    public static int maxProductDifference(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        return (nums[n-1]*nums[n-2])-(nums[0]*nums[1]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxProductDifference(arr));
    }
}
