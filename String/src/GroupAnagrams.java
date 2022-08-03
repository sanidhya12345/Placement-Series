import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    private  static String sortString(char [] array){
        Arrays.sort(array);
        return new String(array);
    }
    public static List<List<String>> groupAnagrams(String[] strs){
        HashMap<String,List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length ; i++) {
            char[] ar = strs[i].toCharArray();
            Arrays.sort(ar);
            String val=new String(ar);
            if(!map.containsKey(val)){
                map.put(val,new ArrayList<>());
            }
            map.get(val).add(strs[i]);
        }

        ArrayList<List<String>> list1 = new ArrayList<>();

        list1.addAll(map.values());

        return list1;
    }

    public static void main(String[] args) {
        String [] arr={"eat","tea","tan","ate","nat","bat"};
        List<String> list=new ArrayList<>();
        for(String i:arr){
            list.add(i);
        }
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(sortString(arr[i].toCharArray()))){
                map.put(sortString(arr[i].toCharArray()),1);
            }
            else{
                map.put(sortString(arr[i].toCharArray()),map.get(sortString(arr[i].toCharArray()))+1);
            }
        }
        List<List<String>> ans=new ArrayList<>();
       for(String key:map.keySet()){
           List<String> ls=new ArrayList<>();
           for(String i:arr){
               if(key.equals(sortString(i.toCharArray()))){
                   ls.add(i);
               }
               list.remove(i);
           }
           ans.add(ls);
       }
        //System.out.println(ans);
        System.out.println(groupAnagrams(arr));
    }
}
