import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class PairOfSimilarStrings {
    private static boolean checkSameCharacterExists(String a,String b){
        Set<Character> seta=new HashSet<>();
        for(char c:a.toCharArray()){
            seta.add(c);
        }
        Set<Character> setb=new HashSet<>();
        for(char c:b.toCharArray()){
            setb.add(c);
        }

        List<Character> setDifference=new ArrayList<>();
        for(Character i:seta){
            if(!setb.contains(i)){
                setDifference.add(i);
            }
        }
        for(Character i:setb){
            if(!seta.contains(i)){
                setDifference.add(i);
            }
        }
        return setDifference.size()==0;
    }
    public static void main(String[] args) {
        String [] array={"nba","cba","dba"};
        int count=0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(checkSameCharacterExists(array[i],array[j])){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
