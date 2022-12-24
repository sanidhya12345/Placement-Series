import java.util.*;

class Pair<A, B> {
    public final A first;
    public final B second;

    public Pair(final A first, final B second) {
        this.first = first;
        this.second = second;
    }
}
public class File {
    static HashMap<ArrayList<Integer>,String> hmap=new HashMap<>();
    static HashMap<Integer,Integer> map=new HashMap<>();
    private static void modInverse(int a, int m)
    {
        for (int x = 1; x < m; x++)
            if (((a%m) * (x%m)) % m == 1)
                map.put(a,x);
    }
    private static String decryption(int mkey,int akey,String [] cipherarray,char [] chars){
        String decrypted="";
        ArrayList<String> clist=new ArrayList<>();
        for(String i:cipherarray){
            String convert=i.toLowerCase();
            String ans="";
            ArrayList<Integer> list=new ArrayList<>();
            for(char ch:convert.toCharArray()){
                int temp=((ch-'a')-akey);
                if(temp<0){
                    temp+=26;
                }
                int val=(temp*map.get(mkey))%26;
                ans+=chars[val];
            }
            clist.add(ans);
        }
        for(String i:clist){
            decrypted+=i+" ";
        }
        return decrypted.trim();
    }
    public static void main(String[] args) {
        for(int i=1;i<=26;i++){
            modInverse(i,26);
        }
        char [] chars=new char[26];
        for(int i=0;i<26;i++){
            chars[i]= (char) ('a'+i);
        }
        String [] cipher={"GERCNZYE"};
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i:map.keySet()){
            int [] arr=new int[2];
            for(int j=1;j<=26;j++){
                arr[0]=i;
                arr[1]=j;
                ArrayList<Integer> lst=new ArrayList<>();
                for(int k:arr){
                    lst.add(k);
                }
                String ans=decryption(i,j,cipher,chars);
                hmap.put(lst,ans);
            }
        }

        System.out.println(hmap);
    }
}
