public class ArrayIsSortedOrNot {
    private static boolean IsSorted(int [] array,int index){
        if(index== array.length-1){
            return true;
        }
        if(array[index+1]>array[index]){
            return IsSorted(array,index+1);
        }
        return false;
    }
    public static void main(String[] args) {
        int [] array={1,6,4,5};
        System.out.println(IsSorted(array,0));
    }
}
