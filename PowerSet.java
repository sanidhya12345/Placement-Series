import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    private static void powerSet(List<Integer> input,List<Integer> output,int index){
        if(index>=input.size()){
            for(int i:output){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }
        powerSet(input,output,index+1);
        output.add(input.get(index));
        powerSet(input,output,index+1);
        output.remove(input.get(index));
    }
    public static void main(String[] args) {
        List<Integer> input=new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        List<Integer> output=new ArrayList<>();
        powerSet(input,output,0);
    }
}
