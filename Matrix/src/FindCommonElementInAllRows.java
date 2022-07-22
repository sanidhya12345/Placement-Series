
public class FindCommonElementInAllRows {
    public static void main(String[] args) {
        int [][] matrix={ {1, 2, 3, 4, 5},
                {2, 4, 5, 8, 10},
                {3, 5, 7, 9, 11},
                {1, 3, 5, 7, 9},
        };

        int max=matrix[0][0];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(max<matrix[i][j]){
                    max=matrix[i][j];
                }
            }
        }
        int [] freq=new int[max+1];
        for(int i=0;i<max+1;i++){
            for(int j=0;j< matrix.length;j++){
                for (int k = 0; k <matrix[0].length ; k++) {
                       if(matrix[j][k]==i){
                           freq[i]++;
                       }
                }
            }
        }

        int max_count=0;
        for (int i = 0; i <freq.length ; i++) {
            if(max_count<freq[i]){
                max_count=freq[i];
            }
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==max_count){
                System.out.println(i);
                break;
            }
        }
    }
}
