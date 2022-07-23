import java.util.Scanner;

public class ValidPalindrome {
    private static void reverse(char array[],int start,int end){
        if(start>end){
            return;
        }
        if(start<=end){
            char temp=array[start];
            array[start]=array[end];
            array[end]=temp;
        }
        reverse(array,start+1,end-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ans="";
        for(int i=0;i<s.length();i++){
            if((int)s.charAt(i)>=64 &&(int)s.charAt(i)<=122){
                ans+=s.charAt(i);
            }
        }

        char [] array=ans.toUpperCase().toCharArray();
        reverse(array,0,array.length-1);
        String reverseString=new String(array);
        boolean res=ans.toUpperCase().equals(reverseString);
        System.out.println(res);
    }
}
