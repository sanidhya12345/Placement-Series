import java.util.HashMap;

public class DayOfWeek {
    public static String dayOfTheWeek(int day, int month, int year) {
        String [] array={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(3,1);
        map.put(4,2);
        map.put(5,3);
        map.put(6,4);
        map.put(7,5);
        map.put(8,6);
        map.put(9,7);
        map.put(10,8);
        map.put(11,9);
        map.put(12,10);
        map.put(1,11);
        map.put(2,12);
        int k=day;
        int m=map.get(month);
        String s=Integer.toString(year);
        int d=Integer.parseInt(s.substring(s.length()-2,s.length()));
        int c=Integer.parseInt(s.substring(0,s.length()-2));
        int index=findIndexOfDay(k,m,d,c);
        return array[index];
    }
    private static int findIndexOfDay(int k,int m,int d,int c){
        int f=k+(((13*m)-1)/5)+d+(d/4)+(c/4)-(2*c);
        return f%7;
    }
    public static void main(String[] args) {
        int day=15;
        int month=8;
        int year=1993;
        System.out.println(dayOfTheWeek(day,month,year));
    }
}
