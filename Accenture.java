import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Accenture {
    static String FrequentCharacterReplaced(String s,char x){
        HashMap<Character,Integer> map=new HashMap<>();
       for(char ch:s.toCharArray()){
           if(!map.containsKey(ch)){
               map.put(ch,1);
           }
           else{
               map.put(ch,map.get(ch)+1);
           }
       }
       int val=Collections.max(map.values());
       char mostfreq=' ';
       for(char key:map.keySet()){
           if(map.get(key)==val){
               mostfreq=key;
               break;
           }
       }
       String ans="";
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)==mostfreq){
               ans+=x;
           }
           else{
               ans+=s.charAt(i);
           }
       }
       return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        String c=sc.next();
        char ch=c.charAt(0);
        System.out.println(FrequentCharacterReplaced(s,ch));
    }
}
