public class FindKthBitInNthBinaryString {
    private static String invert(String s){
        char [] array=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(array[i]=='1'){
                array[i]='0';
            }
            else{
                array[i]='1';
            }
        }
        return new String(array);
    }
    private static String reverse(String s){
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse+=s.charAt(i);
        }
        return reverse;
    }
    private static String func(int i){
        if(i==0){
            return "0";
        }
        return func(i-1)+"1"+reverse(invert(func(i-1)));
    }
    public static void main(String[] args) {
        int n=4;
        String s=func(n-1);
        int k=11;
        System.out.println(s.charAt(k-1));
    }
}


