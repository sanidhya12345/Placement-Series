import java.util.ArrayList;
import java.util.Arrays;

public class MergeOverLappingIntervals {
    public static int[][] merge(int[][] intervals) {
        ArrayList<int []> list=new ArrayList<>();
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i< intervals.length;i++){
            int s=intervals[i][0];
            int e=intervals[i][1];
            if(s<=end){
                end=Math.max(end,e);
            }
            else{
                list.add(new int[]{start,end});
                start=s;
                end=e;
            }
        }
        list.add(new int[]{start,end});
        return list.toArray(new int[list.size()][2]);
    }
    public static void main(String[] args) {
        int [][] intervals={{1,3},{2,6},{8,10},{15,18}};
        Arrays.sort(intervals,(o1, o2)->Integer.compare(o1[0],o2[0]));
        int [][] ans=merge(intervals);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i][0]+" "+ans[i][1]);
        }
    }
}
