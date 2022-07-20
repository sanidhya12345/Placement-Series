import java.util.Scanner;

public class TrappingRainWater {
    private static int trap(int [] height){
        int [] leftmax=new int[height.length];
        int [] rightmax=new int[height.length];
        leftmax[0]=height[0];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=1;i<height.length;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        for(int i=height.length-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }
        int trappedwater=0;
        for(int i=1;i<height.length;i++){
            trappedwater+=Math.min(leftmax[i], rightmax[i])-height[i];
        }
        return trappedwater;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] height=new int[size];
        for(int i=0;i<size;i++){
            height[i]=sc.nextInt();
        }
        System.out.println(trap(height));
    }
}
