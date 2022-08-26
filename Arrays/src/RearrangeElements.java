import java.util.Arrays;

public class RearrangeElements {
    public static void main(String[] args) {
        int [] nums={3,1,-2,-5,2,-4};
        int [] ans=new int[nums.length];
        int oddindex=1;
        int evenIndex=0;
        for(int i:nums){
            if(i>=0){
                ans[evenIndex]=i;
                evenIndex+=2;
            }
            else{
                ans[oddindex]=i;
                oddindex+=2;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
