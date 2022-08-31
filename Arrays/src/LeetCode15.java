import java.util.ArrayList;
import java.util.List;

public class LeetCode15 {
    public static void main(String[] args) {
        int [] arr={-1,0,1,2,-1,4};
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            ArrayList<Integer> ls=new ArrayList<>();
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[j]==0){
                        ls.add(arr[i]);
                        ls.add(arr[j]);
                        ls.add(arr[k]);
                    }
                }
            }
            list.add(ls);
        }
        System.out.println(list);
    }
}
