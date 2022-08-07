import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FrequqencySort {
    public static String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
        }
        String ans="";
        for(char c: map.keySet()){
            int times=map.get(c);
            while (times-->0){
                ans+=c;
            }
        }
        StringBuilder str=new StringBuilder(ans);

        return str.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(frequencySort("Aabb"));
    }
}
