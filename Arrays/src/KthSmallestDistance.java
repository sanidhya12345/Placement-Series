import java.util.ArrayList;
import java.util.Arrays;

public class KthSmallestDistance {
    public int smallestDistancePair(int[] nums, int k){
        Arrays.sort(nums);
        int l=0;
        int r=nums[nums.length-1]-nums[0];
        while(l < r){
            int m = l+ (r-l) / 2;

            if(solve(nums, m)>=k){
                r = m;
            }else {
                l = m +1;
            }

        }
        return l;
    }
    private int solve(int [] nums,int mid){
        int total = 0;
        int left = 0;
        for(int right =0 ; right < nums.length; right++){
            while(nums[right] - nums[left] > mid){
                left++;
            }

            total += right - left;

        }
        return total;
    }
    public static void main(String[] args) {
        KthSmallestDistance obj=new KthSmallestDistance();
        int [] arr={1,6,1};
        System.out.println(obj.smallestDistancePair(arr,3));
    }
}
