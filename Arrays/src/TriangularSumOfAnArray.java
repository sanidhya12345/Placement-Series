public class TriangularSumOfAnArray {
    public int traiangularSum(int [] nums){
        while(nums.length!=1){
            int [] newnum=new int[nums.length-1];
            for(int i=0;i<newnum.length;i++){
                newnum[i]=(nums[i]+nums[i+1])%10;
            }
            nums=newnum;
        }
        return nums[0];
    }
    public static void main(String[] args) {
        TriangularSumOfAnArray obj=new TriangularSumOfAnArray();
        int [] nums={1,2,3,4,5};
        System.out.println(obj.traiangularSum(nums));
    }
}
