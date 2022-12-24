import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6}};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(!map.containsKey(arr[i][j])){
                    map.put(arr[i][j],1);
                }
                else{
                    map.put(arr[i][j],map.get(arr[i][j])+1);
                }
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int i:map.keySet()){
            if(map.get(i)==arr.length){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
