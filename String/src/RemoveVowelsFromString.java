import java.util.*;

public class RemoveVowelsFromString {
    private static String removeVowels(String s){
        String ans="";
        Set<Character> set=new HashSet<>();
        for (char i:s.toCharArray()) {
            if(i=='a' || i=='e' || i=='i' || i=='o' || i=='u'){
                set.add(i);
            }
        }
        for(char i:s.toCharArray()) {
            if (!set.contains(i)) {
                ans += i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="welcome to geeksforgeeks";
        System.out.println(removeVowels(s));
    }
}
