import java.util.ArrayList;

public class EqualRows {
    public static void main(String[] args) {
        int [][] matrix={{3,2,1},{1,7,6},{2,7,7}};
        ArrayList<ArrayList<Integer>> listrows=new ArrayList<>();
        for(int i=0;i< matrix.length;i++){
            ArrayList<Integer> rows=new ArrayList<>();
            for(int j=0;j<matrix[0].length;j++){
                rows.add(matrix[i][j]);
            }
            listrows.add(rows);
        }
        ArrayList<ArrayList<Integer>> listcols=new ArrayList<>();
        for(int i=0;i< matrix.length;i++){
            ArrayList<Integer> cols=new ArrayList<>();
            for(int j=0;j<matrix[0].length;j++){
                cols.add(matrix[j][i]);
            }
            listcols.add(cols);
        }
        int count=0;
        for(int i=0;i<listcols.size();i++){
            for(int j=0;j<listcols.size();j++){
                if(listrows.get(i).equals(listcols.get(j))){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
