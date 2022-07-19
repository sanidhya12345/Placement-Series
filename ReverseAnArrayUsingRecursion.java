import java.util.Arrays;

public class ReverseAnArrayUsingRecursion {
    private static void reverse(char [] s,int start,int end){
        if(start>=end){
            return;
        }
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
        reverse(s,start+1,end-1);
    }
    public static void main(String[] args) {
        char [] array={'s','a','n','i','d','h','y','a'};
        reverse(array,0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
