import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveConsecutiveCharactes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="aabbaa";
        int j=0;
        char [] array=s.toCharArray();
        for(int i=1;i<s.length();i++){
            if(s.charAt(j)==s.charAt(i)){
                array[i]=' ';
                i++;
                j++;
            }
            j++;
        }
        String ans="";
        for(char c:array){
            if((int)c>=64 && (int)c<=122){
                ans+=c;
            }
        }
        System.out.println(ans);
    }
}
