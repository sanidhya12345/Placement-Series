import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbosluteDifference {

   static List<List<Integer>> res=new ArrayList<>();
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int mindiff=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            mindiff=Math.min(mindiff,arr[i+1]-arr[i]);
        }
        for(int i=0;i< arr.length-1;i++)
        {
            if(arr[i+1]-arr[i]==mindiff)
            {
                res.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int [] arr={3,8,-10,23,19,-4,-14,27};
        System.out.println(minimumAbsDifference(arr));
    }
}
