import java.util.HashMap;

public class ConvertArrayIntoMatrix {
    private static  HashMap<Integer,Integer> decryptionOrder(String key){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<key.length();i++){
            map.put(i+1,Character.getNumericValue(key.toCharArray()[i])+1);
        }
        return map;
    }

    private static void matfill(char [][] matrix,char [] key){
        char [][] ans=new char[matrix.length][matrix[0].length];

        for(int i=0;i<key.length;i++){

            int index=Character.getNumericValue(key[i]);

            for(int j=0;j<matrix.length;j++){

                ans[j][i]=matrix[j][index];
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static char[][] fillColumnWise(char [] cipher,int klength){
        int rows=cipher.length/klength;
        int cols=klength;
        char [][] matrix=new char[rows][cols];
        int index=0;
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                matrix[j][i]=cipher[index];
                index++;
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        String s="attackpostponeduntiltwoamxyz";
        String s1="ttnaaptmtsuoaodwcoixknlypetz";
        char [] array=s1.toCharArray();
        char [][] matrix=fillColumnWise(array,7);
        String key="3201456";
        matfill(matrix,key.toCharArray());

    }
}
