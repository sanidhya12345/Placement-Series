import java.util.HashMap;

public class SingleElementInAsortedArray {
//    public static int singleNonDuplicate(int[] nums) {
//        HashMap<Integer,Integer> map=new HashMap<>();
//        for(int i:nums){
//            if (!map.containsKey(i)){
//                map.put(i,1);
//            }
//            else{
//                map.put(i,map.get(i)+1);
//            }
//        }
//        int ans=0;
//        for(int i:map.keySet()){
//            if(map.get(i)==1){
//                ans=i;
//                break;
//            }
//        }
//        return ans;
//    }
public static int singleNonDuplicate(int [] nums){
    return binarySearchHelper(nums);
}
    private static int binarySearchHelper(int [] nums){
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=(low+high)/2;

            if(nums[mid]==nums[mid+1]){
                mid=mid-1;
            }
            if((mid-low+1)%2!=0){
                high=mid;
            }
            else{
                low=mid+1;
            }

        }
        return nums[low];
    }
    public static void main(String[] args) {
        int [] nums={1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }
}
