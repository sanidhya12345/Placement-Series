/*
 * Copyright (c) 2023 by Sanidhya Varshney.
 */

import java.util.Scanner;

public class CapitalizetheTitle {
    public static String capitalizeTitle(String title) {
        String [] titleArray=title.split(" ");
        String ans="";
        for(String str:titleArray){
            if(str.length()==1 || str.length()==2){
                ans+=str.toLowerCase();
            }
            else{
//                if()
//                String substring=str.substring(1);
//                String add=firstLetter+substring;
//                ans+=add;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String text="capiTalIze tHe titLe";
        System.out.println(capitalizeTitle(text));
    }
}
