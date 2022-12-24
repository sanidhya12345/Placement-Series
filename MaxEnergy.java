import java.util.Scanner;

public class MaxEnergy {
    public static int maxenergy(int [] ener){
        int max = ener[0];

        for (int i = 0; i < ener.length; i++) {
            for (int j = i + 1; j < ener.length; j++) {

                int currentMax = ener[i] + ener[j];

                if (currentMax > max) {
                    max = currentMax;
                }
            }
        }

        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int [] array=new int[length];
        for(int i=0;i<length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println(maxenergy(array));
    }
}
