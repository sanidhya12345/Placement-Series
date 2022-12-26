import java.util.Arrays;
public class SortThePeople {
    public static void main(String[] args) {
        String [] names={"Alice","Bob","Bob"};
        int [] heights={155,185,150};
        int n = heights.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(heights[j+1] > heights[j] ){
                    int temp = heights[j];
                    heights[j] = heights[j+1];
                    heights[j+1] = temp;
                    String tem = names[j];
                    names[j] = names[j+1];
                    names[j+1] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(names));
    }
}
