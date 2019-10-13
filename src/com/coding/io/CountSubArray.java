package com.coding.io;

public class CountSubArray {

    static int countKsubArray(int [] arr, int n, int k) {
        int count =0;
        for (int i = 0; i <n ; i++) {

            if (arr[i]<=k)
                 count++;

            int val = arr[i];                        //O(n^2)
            for (int j = i+1; j <n ; j++) {
                 val = val*arr[j];

                 if (val<=k)
                     count++;
            }
        }
        return  count;
    }


        public static void main(String[] args) {
            int array[] = {1,2,3,4,5,9,6,9,7,60,8};
            int k = 10;
            int size = array.length;

            int count = countKsubArray(array, size, k);
            System.out.print(count);
        }
}