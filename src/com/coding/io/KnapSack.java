package com.coding.io;

public class KnapSack {

    private static int knapSack(int capacity, int[] wt, int[] val, int n) {
        int result =0;
        int temp1=0;
        int temp2=0;

        if (n==0 || capacity==0)
            return 0;
        else if (wt[n] > capacity)
             knapSack(capacity, wt, val, n-1);
        else {
            temp1 = knapSack(capacity, wt, val, n - 1);
            temp2 = val[n] + knapSack(capacity - wt[n], wt, val, n - 1);
        }

            result = Math.max(temp1,temp2);
     return result;
    }



    public static void main(String[] args) {
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{10, 20, 30};
        int  C = 50;
        int n = val.length-1;
        System.out.println(knapSack(C, wt, val, n));
    }
}
