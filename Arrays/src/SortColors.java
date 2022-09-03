import java.util.*;

public class SortColors {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int [] colors=new int[length];
        for(int i=0;i<length;i++){
            colors[i]= sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i< colors.length;i++){
            if(!map.containsKey(colors[i])){
                map.put(colors[i],1);
            }
            else {
                map.put(colors[i],map.get(colors[i])+1);
            }
        }
        int [] ans=new int[length];
        int k=0;
        for(int i:map.keySet()){
            for(int j=0;j< map.get(i);j++){
                ans[k]=i;
                k++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
