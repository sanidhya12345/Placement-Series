import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindTheDuplicateNumber {
    private static HashMap<Integer,Integer> map=new HashMap<>();

    private static int duplicateNumber(){
        int ans=0;
        int maxValueInMap= Collections.max(map.values());
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==maxValueInMap){
                ans+= entry.getKey();
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] numbers=new int[size];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }
        //Storing the frequency of every element.

        for(int i=0;i<size;i++){
            if(!map.containsKey(numbers[i])){
                map.put(numbers[i],1);
            }
            else{
                map.put(numbers[i],map.get(numbers[i])+1);
            }
        }
        System.out.println(duplicateNumber());
    }
}
