import java.util.ArrayList;

public class SubArrayProductLessThanK {
    public static void main(String[] args) {
        int [] arr={4,5,6};
        int k=10;
        int start=0;
        int product=1;
        int res=0;
        for(int end=0;end<arr.length;end++){
            product=product*arr[end];
            while(start<end && product>=k){
                product/=arr[start++];
            }
            if(product<k){
                int len=end-start+1;
                res+=len;
            }
        }
        System.out.println(res);
    }
}
