import java.util.Arrays;
import java.util.HashMap;

public class FirstUniqueCharacterInString {
    static HashMap<Character,Integer> map=new HashMap<>();
    private static int findIndex(String s){
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s="loveleetcode";
        for(char ch:s.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
        }
        System.out.println(findIndex(s));
    }
}
