import java.util.ArrayList;
import java.util.List;

public class Pattern {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        List<String> left=new ArrayList<String>();
        for(int i=1;i<=5;i+=2){
           String ans="";
           for(int j=0;j<i;j++){
               ans+="*";
           }
           left.add(ans);
        }
        for(int i=0;i<5;i++){
            String ans="";
            for(int j=0;j<i+1;j++){
                ans+="*";
            }
            list.add(ans);
        }
        for(int i=0;i<list.size();i++){
            if(i<list.size()/2){
                System.out.println(list.get(i));
            }
            else{
                String ans=left.get(i-5/2);
                ans+= list.get(i);
                System.out.println(ans);
            }
        }
    }
}
