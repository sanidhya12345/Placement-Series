public class PrintNumberInEnglish {
    static String [] array={"zero","one","two","three","four","five","six","seven","eight","nine"};
    private static void answer(int num){
        if(num==0){
            return ;
        }
        answer(num/10);
        System.out.print(array[num%10]+" ");
    }
    public static void main(String[] args) {
        int num=12;
        answer(num);
    }
}
