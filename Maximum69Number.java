import java.util.ArrayList;
import java.util.Collections;

public class Maximum69Number {
    public static int maximum69Number (int num) {
        if(num==9 || num==99 || num==999 || num==9999 || num==9999 || num==99999){
            return num;
        }
        int max=num;
        String number=Integer.toString(num);
        int i=0;
        while(i<number.length()){
            char [] chars=number.toCharArray();
            if(chars[i]=='9'){
                chars[i]='6';
            }
            else{
                chars[i]='9';
            }
            String str=new String(chars);
            int val=Integer.parseInt(str);
            max=Math.max(max,val);
            i++;
        }
        return max;
    }
    public static void main(String[] args) {
        int num=696;
        System.out.println(maximum69Number(num));
    }
}
