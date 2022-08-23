public class CheckTheArrayIsSorted {
    public static boolean check(int[] arr) {
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                count++;
            }
        }
        if(arr[arr.length-1]>arr[0]){
            count++;
        }
        return count<=1;
    }
    public static void main(String[] args) {
        int [] nums={2,1,3,4};
        System.out.println(check(nums));
    }
}
