import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class OddVowels {
    static Set<Character> set=new HashSet<>();
    private static boolean isOddVowels(String s){
        int count=0;
        for(char ch:s.toCharArray()){
            if(set.contains(ch)){
                count++;
            }
        }
        return count%2!=0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        String s=sc.next();
        System.out.println(isOddVowels(s));
    }
}
