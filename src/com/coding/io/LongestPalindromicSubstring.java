package com.coding.io;

public class LongestPalindromicSubstring {


    private static String processString(String s){

        String lSubString = "";

        if (s == null)
             return "";

        if (s.length()==1)
            return s;

        char[]chars = s.toCharArray();

        for (int i = 0; i <chars.length ; i++) {
          String temp = expand(s,i,i);
          if (temp.length() > lSubString.length())
               lSubString = temp;
        }

        return lSubString;
    }

    private static String expand(String s,int low,int high){

       while ( ( low>=0 && high<s.length() ) && ( s.charAt(low)==s.charAt(high) ) ){
           low--;
           high++;
       }
       return s.substring(low+1,high);
    }


    public static void main(String[] args) {
        System.out.println( processString("ABCACDAABAA") );
    }
}