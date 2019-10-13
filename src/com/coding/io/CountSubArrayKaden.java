package com.coding.io;

public class CountSubArrayKaden {

    static int countKsubArray(int[]arr, int n, int k){
        int max_global=arr[0];
        int max_current=arr[0];
        int count=0;
         for (int i = 0; i<n; i++) {
            if (arr[i]<=k)
                 count++;                                  //O(n)
           max_current=Math.max(arr[i],max_current+arr[i]);
           max_global=Math.max(max_current,max_global);
            if (max_global<=k)
                count++;
         }
        return count;
    }

    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,9,6,9,7,60,8};
        int k = 10;
        int size = array.length;
        int count = countKsubArray(array, size, k);
        System.out.print(count);
    }
}