public class CellWithOddValues {
    public static void main(String[] args) {
        int [][] matrix=new int[2][3];
        int m=2;
        int n=2;
        int [][] indexes={{1,1},{0,0}};
        for(int i=0;i< indexes.length;i++){
            int row=indexes[i][0];
            int col=indexes[i][1];
            for(int j=0;j<n;j++){
                matrix[row][j]++;
            }
            for(int k=0;k<m;k++){
                matrix[k][col]++;
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]%2!=0) count++;
            }
        }
        System.out.println(count);
    }
}
