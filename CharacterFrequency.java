import java.util.Arrays;

public class CharacterFrequency {
    private static void printfreq(String s){
        int [] chars=new int[26];
        for(char c:s.toCharArray()){
            chars[c-97]++;
        }
        for(int i=0;i<26;i++){
            if(chars[i]!=0){
                System.out.println((char)(i+97)+"->"+chars[i]);
            }
        }
    }
    public static void main(String[] args) {
        String s="abbcddeffg";
        printfreq(s);
    }
}
