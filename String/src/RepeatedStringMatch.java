public class RepeatedStringMatch {
    public static int repeatedStringMatch(String a, String b) {
        StringBuilder sb =new StringBuilder();int ans=0;
        while(sb.length()<b.length())
        {
            ans++;
            sb.append(a);
        }

        if(sb.toString().contains(b)) // indexOf method of String Builder can also be used
            return ans;

        sb.append(a);
        if(sb.toString().contains(b))
            return ans+1;

        return -1;
    }
    public static void main(String[] args) {
        String a="abcd";
        String b="cdabcdab";
        System.out.println(repeatedStringMatch(a,b));
    }
}
