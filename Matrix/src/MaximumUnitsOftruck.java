import java.util.Arrays;
public class MaximumUnitsOftruck {
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> Integer.compare(b[1], a[1]));
        int total = 0;
        for (int[] each : boxTypes) {
            int num_box = each[0];
            int putin = Math.min(truckSize, num_box);
            if (putin == 0) {
                return total;
            }
            total += putin * each[1];
            truckSize -= putin;
        }
        return total;
    }
    public static void main(String[] args) {
        int [][] boxes={{1,3},{5,5},{2,5},{4,2},{4,1},{3,1},{2,2},{1,3},{2,5},{3,2}};
        System.out.println(maximumUnits(boxes,35 ));
    }
}
