package com.coding.io;

public class LongestCommonSubSequence {

    private static int lcs(String s1, String s2, int m, int n) {
        int result = 0;
        int temp1=0;
        int temp2=0;

        if (m == 0 || n == 0)
            return 0;
        if (s1.charAt(m-1) == s2.charAt(n-1))
              result = 1+lcs(s1, s2, m-1, n-1);
        else {
            temp1 = lcs(s1, s2, m-1, n);
            temp2=lcs(s1, s2, m, n-1);
            result =Math.max(temp1,temp2);
        }

        return  result;
    }


    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        int m = s1.length();
        int n = s2.length();
        System.out.println(lcs(s1,s2,m,n));
    }


}
