class BinarySearch {
    private static int binarySearch(int [] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=(high+low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr={-1,0,3,5,9,12};
        int target=9;
        System.out.println(binarySearch(arr,target));
    }
}
