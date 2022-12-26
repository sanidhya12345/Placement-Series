import java.util.Scanner;

public class MaximumNumberOfBalloons {
    public static int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        for(char ch : text.toCharArray())
            freq[ch-'a']++;
        int count = 10000;
        for(char ch : "balloon".toCharArray()){
            if(ch == 'l' || ch == 'o')
                count = Math.min(count, freq[ch-'a']/2);
            else
                count = Math.min(count, freq[ch-'a']);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.next();
        System.out.println(maxNumberOfBalloons(text));
    }
}
