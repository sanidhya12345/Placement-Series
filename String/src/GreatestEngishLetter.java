import java.util.Arrays;

public class GreatestEngishLetter {
    public static void main(String[] args) {
        String s="arRAzFif";
        String result="";
        int[] lowerCase = new int[26];
        int[] upperCase = new int[26];

        for(char c:s.toCharArray()){
            if(c >= 65 && c <=90){
                upperCase[(int)(c-65)]++;
            } else if(c >= 97 && c <=122){
                lowerCase[(int) (c-97)]++;
            }
        }
        System.out.println(Arrays.toString(upperCase));
        System.out.println(Arrays.toString(lowerCase));
        for(int i=0;i<26;i++){
            if(upperCase[i] != 0 && lowerCase[i] !=0){
                result = ((char)(i+65))+"";
            }
        }
        System.out.println(result);
    }
}
