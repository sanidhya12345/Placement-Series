import java.util.*;
public class ReverseArrayInGroups {

    private static void reverseIngroups(ArrayList<Integer> arr,int n,int k){
        for(int i=0;i<n;i+=k){
            int left=i;
            int right=Math.min(i+k-1,n-1);

            while(left<right){
                Collections.swap(arr,left,right);
                left++;
                right--;
            }
        }
    }
}
