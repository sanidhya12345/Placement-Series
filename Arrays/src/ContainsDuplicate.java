import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainsDuplicate {
    private static boolean containsDuplicate(int [] array){
        Set<Integer> set=new HashSet<>();
        for(int i:array){
            set.add(i);
        }
        return set.size()!=array.length;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int [] array=new int[length];
        for(int i=0;i<array.length;i++){
            array[i]= sc.nextInt();
        }
        System.out.println(containsDuplicate(array));
    }
}
