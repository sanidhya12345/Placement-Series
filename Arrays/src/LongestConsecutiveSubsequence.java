import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestConsecutiveSubsequence {
    public static int longesConsecutiveSequence(int [] nums,int n){
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){

                int j=nums[i];
                while(set.contains(j)){
                    j++;
                }
                if(ans<j-nums[i]){
                    ans=j-nums[i];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(longesConsecutiveSequence(arr,n));
    }
}
