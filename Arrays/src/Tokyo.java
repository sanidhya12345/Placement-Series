import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tokyo {
    private static List<Long> calculate(List<Long> list){
        List<Long> ans=new ArrayList<>();
        long medalwon=0;
        long atleastwon=0;
        long zerowon=0;
        long lastthree=0;
        for(long i:list){
            if(i>0){
                medalwon+=i;
            }
            if(i>=1){
                atleastwon++;
            }
            if(i==0){
                zerowon++;
            }
        }
        for(int i=list.size()-1;i>=list.size()-3;i--){
            lastthree+=list.get(i);
        }
        ans.add(medalwon);
        ans.add(atleastwon);
        ans.add(zerowon);
        ans.add(lastthree);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Long> input=new ArrayList<>();
        for(int i=0;i<13;i++){
            input.add(sc.nextLong());
        }
        System.out.println(calculate(input));
    }
}
