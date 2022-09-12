import java.util.Scanner;

public class SevenSegmentDisplay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("");
        int testcases=sc.nextInt();
        while (testcases-->0){
            char [] array=sc.next().toCharArray();
            int sticks=0;
            for (char x : array)
            {
                if (x=='1')
                    sticks += 2;
                else if (x=='7')
                    sticks += 3;
                else if (x=='4')
                    sticks += 4;
                else if ((x=='2') || (x=='3') || (x=='5'))
                    sticks += 5;
                else if ((x=='0') || (x=='6') || (x=='9'))
                    sticks += 6;
                else if (x=='8')
                    sticks += 7;
            }
            if (3 <= sticks && sticks%2 == 1)
            {
                sb.append('7');
                sticks -= 3;
            }
            while (20 <= sticks)
            {
                sb.append("1111111111");
                sticks -= 20;
            }
            while (1 < sticks)
            {
                sb.append('1');
                sticks -= 2;
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
