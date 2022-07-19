import java.util.Scanner;

public class ExponentUsingRecursion {
    private static int calPower(int num,int pow,int ans){
        if(pow==0){
            return ans;
        }
        return calPower(num,pow-1,ans*num);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int power=sc.nextInt();
        System.out.println(calPower(number,power,1));
    }
}
