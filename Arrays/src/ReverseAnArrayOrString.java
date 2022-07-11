import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArrayOrString {

    private static String reverseString(String s){
        char [] chars=s.toCharArray();
        char temp;
        int start=0;
        int end=s.length()-1;
        while(start<end){
            temp=chars[start];
            chars[start]=chars[end];
            chars[end]=temp;
            start++;
            end--;
        }
        return new String(chars);
    }
    private static void reverse(int [] array,int start,int end){
        int temp;
        while(start<end){
              temp=array[start];
              array[start]=array[end];
              array[end]=temp;
              start++;
              end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int [] array=new int[length];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        reverse(array,0,length-1);
        System.out.println(Arrays.toString(array));
        String s=sc.next();
        System.out.println("Original String:- "+s);
        System.out.println("Reversed String:-"+reverseString(s));
    }
}
