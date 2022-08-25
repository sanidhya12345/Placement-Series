
public class RowWithMax1s {
   public  static int rowWithMax1s(int arr[][], int n, int m) {
        // code here
       int j=m-1;
       int max = 0;

       for (int i = 0; i < n; i++) {
           while (j >= 0 && arr[i][j] == 1) {
               j = j - 1;
               max = i;
           }
       }
       if(max==0&&arr[0][m-1]==0)
           return -1;
       return max;
    }

    public static void main(String[] args) {
        int [][] arr={{0,0},{0,0}};
        int n=arr.length;
        int m=arr[0].length;
        System.out.println(rowWithMax1s(arr,n,m));
    }
}
