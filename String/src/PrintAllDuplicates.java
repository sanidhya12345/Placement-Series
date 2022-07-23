import java.util.HashMap;
import java.util.Scanner;

public class PrintAllDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else{
                map.put(c, map.get(c)+1);
            }
        }
        for(char key:map.keySet()){
            if(map.get(key)>1){
                System.out.println(key);
            }
        }
    }
}
