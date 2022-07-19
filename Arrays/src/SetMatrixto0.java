import java.util.Arrays;

public class SetMatrixto0 {
    private static void changeRespectiveRowsAndColumntoZero(int [][] matrix){
        int rows=matrix.length;
        int cols=matrix[0].length;
        int [] dummy1=new int[rows];
        int [] dummy2=new int[cols];
        Arrays.fill(dummy1,-1);
        Arrays.fill(dummy2,-1);
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                    dummy1[i]=0;
                    dummy2[j]=0;
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(dummy1[i]==0 || dummy2[j]==0){
                    matrix[i][j]=0;
                }
            }
        }
    }
    private static void printMtrix(int [][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j< matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] matrix={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        changeRespectiveRowsAndColumntoZero(matrix);
        printMtrix(matrix);
    }
}
