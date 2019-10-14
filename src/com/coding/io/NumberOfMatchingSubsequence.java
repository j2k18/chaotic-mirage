package com.coding.io;

public class NumberOfMatchingSubsequence {

    public static int numMatchingSubseq(String s, String[] words) {

        if(s.isEmpty() || words.length<=0)
            return 0;

        int counter=0;
        for (String word:words) {
            if(isSequence(word,s))
                counter ++;
        }
        return counter;
    }


    static boolean isSequence(String word,String s){
        int wordLen = word.length();
        int j=0;
        for (int i = 0; i <s.length() ; i++)
            if(j<wordLen &&  ( s.charAt(i)==word.charAt(j) ))
                j ++;
        return (wordLen==j);
    }

    public static void main(String[] args) {
        String s = "abcde";
        String[]words = {"a", "bb", "acd", "ace"};
        System.out.println( numMatchingSubseq(s,words) );
    }
}
