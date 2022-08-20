import java.util.HashMap;

public class DecodTheMessage {
    public static String decodeMessage(String key, String message) {
        char ch='a';
        HashMap<Character,Character> hm=new HashMap<>();
        hm.put(' ',' ');
        for(int i=0;i<key.length();i++)
        {
            char c=key.charAt(i);
            if(!hm.containsKey(c) && c!=' ')
            {
                hm.put(c,ch);
                ch++;
            }
        }
        String ans="";
        for(char c:message.toCharArray()){
            ans+=hm.get(c);
        }
        return ans;
    }
    public static void main(String[] args) {
        String key="the quick brown fox jumps over the lazy dog";
        String message="vkbs bs t suepuv";
        System.out.println(decodeMessage(key,message));
    }
}
