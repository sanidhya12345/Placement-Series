import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class LuckyInteger {
    public static int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.put(i,map.get(i)+1);
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int i:map.keySet()){
            if(i==map.get(i)){
                list.add(i);
            }
        }
        if(list.size()==0) return -1;
        return Collections.max(list);
    }
    public static void main(String[] args) {
        int [] arr={1,2,2,3,3,3};
        System.out.println(findLucky(arr));
    }
}
