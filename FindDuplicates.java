import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class FindDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(Integer num:nums){
            if(!map.containsKey(num)) map.put(num,1);
            else
                map.put(num,map.get(num)+1);
        }

        for(Integer key:map.keySet()){
            if(map.get(key)==2){
                list.add(key);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
    }
}
