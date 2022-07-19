public class NumberOfJumps {
    static int count=0;
    private static int numberOfWays(int num){
        if(num<0){
            return 0;
        }
        if(num==0){
            return 1;
        }
        return numberOfWays(num-3)+numberOfWays(num-2)+numberOfWays(num-1);
    }
    public static void main(String[] args) {
        int number=4;
        System.out.println(numberOfWays(number));
    }
}
