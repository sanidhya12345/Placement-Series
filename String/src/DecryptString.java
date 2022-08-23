import java.util.ArrayList;
import java.util.HashMap;

public class DecryptString {
    static HashMap<Integer,Character> map1=new HashMap<>();
    static HashMap<String,Character> map2=new HashMap<>();
    public static void main(String[] args) {
       String s="1326#23425#";
       ArrayList<String> list=new ArrayList<>();
       ArrayList<String> list2=new ArrayList<>();
       String ans="";
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='#'){
               list.add(s.substring(i-2,i+1));
           }
       }
        System.out.println(ans);
    }
}
