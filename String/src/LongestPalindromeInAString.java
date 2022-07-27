public class LongestPalindromeInAString {
    private static String longestPalindromeSubstring(String str){
        int n=str.length();
        boolean [][] table =new boolean[n][n];
        int maxlength=1;
        for(int i=0;i<n;i++){
            table[i][i]=true;
        }
        int start=0;
        for(int i=0;i<n-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                table[i][i+1]=true;
                start=1;
                maxlength=2;
            }
        }
        for(int k=3;k<=n;++k){
            for(int i=0;i<n-k+1;++i){
                int j=i+k-1;

                if(table[i+1][j-1] && str.charAt(i)==str.charAt(j)){
                    table[i][j]=true;
                    if(k>maxlength){
                        start=i;
                        maxlength=k;
                    }
                }
            }
        }
        return str.substring(start,start+maxlength);
    }
    public static void main(String[] args) {
        String s="aaaabbaa";
        System.out.println(longestPalindromeSubstring(s));
    }
}
