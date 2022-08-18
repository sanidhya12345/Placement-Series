import java.util.ArrayList;
import java.util.Scanner;

public class MergeTwoLists {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arrlength=sc.nextInt();
        int [] ints=new int[arrlength];
        for(int i=0;i<arrlength;i++){
            ints[i]=sc.nextInt();
        }
        String s= sc.next();
        char [] array=s.toCharArray();
        String ans="";
        if(arrlength==array.length){
            for(int i=0;i<array.length;i++){
                ans+=ints[i];
                ans+=array[i];
            }
        }
        if(arrlength>array.length){
            for(int i=0;i<array.length;i++){
                ans+=ints[i];
                ans+=array[i];
            }
            for(int j=array.length;j<arrlength;j++){
                ans+=ints[j];
            }
        }
        if(array.length>arrlength){
            for(int i=0;i<arrlength;i++){
                ans+=ints[i];
                ans+=array[i];
            }
            for(int j=arrlength;j<array.length;j++){
                ans+=array[j];
            }
        }
        ArrayList<Character> ansList=new ArrayList<>();
        for(char ch:ans.toCharArray()){
            ansList.add(ch);
        }
        System.out.println(ansList);
    }
}
