/*
 * Copyright (c) 2023 by Sanidhya Varshney.
 */

import java.util.Scanner;

public class CounttheDigitsThatDivideaNumber {
    public static int countDigits(int num) {
        int count=0;
        String n=Integer.toString(num);
        for(char c:n.toCharArray()){
            int val=Character.getNumericValue(c);
            if(num%val==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(countDigits(num));
    }
}
