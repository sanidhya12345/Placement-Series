import java.util.HashMap;

public class CHeckDistanceBetweenSamLetter {
    public static void main(String[] args) {
        String s="aa";
        int distance[]={1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            int pos1=i;
            char ch=s.charAt(i);
            for(int j=i+1;j<s.length();j++){
                int pos2=j;
                if(ch==s.charAt(j)){
                    map.put(ch,Math.abs(pos1-pos2));
                }
            }
        }
        int count=0;
        for(char c:map.keySet()){
            if(distance[c-97
                    ]==map.get(c)-1) count++;
        }
        System.out.println(count==s.length()/2);
    }
}
