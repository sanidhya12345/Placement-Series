import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Codeforces798A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases--!=0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            String a=sc.next();
            String b=sc.next();
            char [] array1= a.toCharArray();
            Arrays.sort(array1);
            char [] array2=b.toCharArray();
            Arrays.sort(array2);
            Queue<Character> aqq=new ArrayDeque<>();
            for(char ch:array1){
                aqq.add(ch);
            }
            Queue<Character> bqq=new ArrayDeque<>();
            for(char ch:array2){
                bqq.add(ch);
            }
            int ak=0;
            int bk=0;
            String ans="";
            while(!aqq.isEmpty() && !bqq.isEmpty()){
                boolean flag=bqq.peek()<aqq.peek();
                if(flag && bk==k) flag=false;
                if(!flag && ak==k) flag=true;
                if(flag){
                    ans+=bqq.poll();
                    bk++;
                    ak=0;
                }
                else{
                    ans+=aqq.poll();
                    ak++;
                    bk=0;
                }
            }
            System.out.println(ans);
        }
    }
}
