import java.util.HashMap;
import java.util.Stack;

public class RemoveOuterParenthesis {
    private static String decompostion(String s){
        Stack<Character> st = new Stack<>();
        String res = "";
        for(Character c: s.toCharArray()){
            if(c == '('){
                if(!st.isEmpty()){
                    res += c;
                }
                st.push(c);
            }else{
                st.pop();
                if(!st.isEmpty()){
                    res += c;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s="(()())";
        System.out.println(decompostion(s));
    }
}
