import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlayFairCipher {
    static  void encryptByPlayfairCipher(char str[], char key[])
    {
        char keyT[][]=new char[5][5];
        int ks,ps;

        ks = key.length;
        ks = removeSpaces(key, ks);
        toLowerCase(key, ks);
        ps = str.length;
        toLowerCase(str, ps);
        ps = removeSpaces(str, ps);
        ps = prepare(str, ps);

        generateTable(key, ks, keyT);

        encrypt(str, keyT, ps);
    }
    static void toLowerCase(char plain[], int ps)
    {
        int i;
        for (i = 0; i < ps; i++) {
            if (plain[i] > 64 && plain[i] < 91)
                plain[i] += 32;
        }
    }
    static int removeSpaces(char[] plain, int ps)
    {
        int i, count = 0;
        for (i = 0; i <ps && count<plain.length-1; i++)
            if (plain[i] != ' ')
                plain[count++] = plain[i];
        plain[count] = '\0';
        return count;
    }
    private static void generateTable(char [] key,int ks,char[][] matrix){
        int i, j, k, flag = 0;
        int dicty[]=new int[26];
        for (i = 0; i < ks; i++) {
            if (key[i] != 'j')
                dicty[key[i] - 97] = 2;
        }
        dicty['j' - 97] = 1;
        i = 0;
        j = 0;
        for (k = 0; k < ks; k++) {
            if (dicty[key[k] - 97] == 2) {
                dicty[key[k] - 97] -= 1;
                matrix[i][j] = key[k];
                j++;
                if (j == 5) {
                    i++;
                    j = 0;
                }
            }
        }

        for (k = 0; k < 26; k++) {
            if (dicty[k] == 0) {
                matrix[i][j] = (char)(k + 97);
                j++;
                if (j == 5) {
                    i++;
                    j = 0;
                }
            }
        }
    }
    static void search(char keyT[][], char a, char b, int arr[])
    {
        int i, j;

        if (a == 'j')
            a = 'i';
        else if (b == 'j')
            b = 'i';

        for (i = 0; i < 5; i++) {

            for (j = 0; j < 5; j++) {

                if (keyT[i][j] == a) {
                    arr[0] = i;
                    arr[1] = j;
                }
                else if (keyT[i][j] == b) {
                    arr[2] = i;
                    arr[3] = j;
                }
            }
        }
    }
    static int mod5(int a) { return (a % 5); }

    static int prepare(char str[], int ptrs)
    {
        if (ptrs % 2 != 0) {
            str[ptrs++] = 'z';
            str[ptrs] = '\0';
        }
        return ptrs;
    }
    static void encrypt(char str[], char keyT[][], int ps)
    {
        int i;
        int [] a=new int[4];

        for (i = 0; i < ps; i += 2) {

            search(keyT, str[i], str[i + 1], a);

            if (a[0] == a[2]) {
                str[i] = keyT[a[0]][mod5(a[1] + 1)];
                str[i + 1] = keyT[a[0]][mod5(a[3] + 1)];
            }
            else if (a[1] == a[3]) {
                str[i] = keyT[mod5(a[0] + 1)][a[1]];
                str[i + 1] = keyT[mod5(a[2] + 1)][a[1]];
            }
            else {
                str[i] = keyT[a[0]][a[3]];
                str[i + 1] = keyT[a[2]][a[1]];
            }
        }
    }
    private static boolean isContainsOtherCharacters(String plain){
        Pattern pattern = Pattern.compile("[^a-z]");
        Matcher matcher = pattern.matcher(plain);
        return matcher.find();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String key=sc.next();
//        while (isContainsOtherCharacters(key)){
//            System.out.println("Re-enter key");
//            key=sc.next();
//        }
        String plain=sc.next();
        char [] str=plain.toCharArray();
        encryptByPlayfairCipher(str,key.toCharArray());
//        for(int i=0;i<matrix.length;i++){
//            for(int j=0;j<matrix[0].length;j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }
        System.out.println(Arrays.toString(str));
    }
}
