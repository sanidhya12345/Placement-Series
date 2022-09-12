public class LargestLocalValuesIMatrix {
    public static int[][] largestLocal(int[][] grid) {
        int [][]ans=new int[grid.length-2][grid.length-2];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        return ans;
    }
    public static void main(String[] args) {
        int [][] grid={{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        largestLocal(grid);
    }
}
