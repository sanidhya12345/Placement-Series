import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CountVowelsSubstrings {
    public static int countVowelSubstrings(String word) {
        int out=0;
        for (int i=0;i<word.length();i++){
            Set<Character> st=new HashSet<>();
            for (int j=i;j<word.length();j++){
                if (!isVowel(word.charAt(j)))break;
                st.add(word.charAt(j));
                if (st.size()==5)out++;
            }
        }
        return out;
    }
    public static boolean isVowel(char c){
        return c=='a'||c=='i'||c=='o'||c=='u'||c=='e';
    }
    public static void main(String[] args) {
        String s="unicornarihan";
        System.out.println(countVowelSubstrings(s));
    }
}
