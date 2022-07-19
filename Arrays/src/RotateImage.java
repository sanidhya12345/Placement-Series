import java.util.Scanner;

public class RotateImage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int [][] image=new int[length][length];
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                image[i][j]= sc.nextInt();
            }
        }
        // now transposing the given image and store into duplicate image.

        int [][] duplicate=new int[length][length];
        for (int i = 0; i <length ; i++) {
            for (int j = 0; j <length ; j++) {
                duplicate[j][i]=image[i][j];
            }
        }

        // now reverse all the rows of given image.

        for(int i=length-1;i>=0;i--){
            for(int j=length-1;j>=0;j--){
                image[length-1-i][length-1-j]=duplicate[length-i-1][j];
            }
        }

        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                System.out.print(image[i][j]+" ");
            }
            System.out.println();
        }
    }
}
