
public class CountAsterisks {
    public static void main(String[] args) {
        String s="yo|uar|e**|b|e***au|tifu|l";
        String [] temp = s.split("\\|");
        int cnt=0;
        for(int i=0; i<temp.length; i+=2){
            for(int j=0; j<temp[i].length(); ++j){
                if(temp[i].charAt(j) == '*')
                    cnt++;
            }
        }
        System.out.println(cnt);
    }
}
