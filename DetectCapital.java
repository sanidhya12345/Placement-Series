/*
 * Copyright (c) 2023 by Sanidhya Varshney.
 */

public class DetectCapital {
    class Solution {
        public boolean detectCapitalUse(String word) {
            int upperLetter=0;
            int lowerLetter=0;
            for(char c:word.toCharArray()){
                if((int)c>=65 && (int)c<=90) upperLetter++;
                else lowerLetter++;
            }
            if(word.length()==upperLetter){
                return true;
            }
            if((int)word.charAt(0)>=65 && (int)word.charAt(0)<=90){
                String sub=word.substring(1);
                int l=0;
                for(char c:sub.toCharArray()){
                    if((int)c>=97 && (int)c<=122){
                        l++;
                    }
                }
                if(l==word.length()-1){
                    return true;
                }
            }
            if(word.length()==1){
                return true;
            }
            if(lowerLetter==word.length()) return true;
            return false;
        }
    }
}
