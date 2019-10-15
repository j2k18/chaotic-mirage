package com.coding.io;

import java.util.Arrays;

public class LongestIncreasingSubSequence {

    static int findLargestIncreasingSubSequence(int [] arr){
        //Base case
        if (arr.length == 0)
             return 0;
        int max_len_sofar = 1;
        int[]max_len_arr = new int[arr.length]; //Create  a new array for storing max len for all the sub problems
        Arrays.fill(max_len_arr,1);  //Fill every cell with 1 considering if the array size is at all 1
        for (int i = 1; i <arr.length ; i++) {   //Go through each items or arr from index 1
            for (int j = 0; j<i; j++) {   //go through indices less than i
               if (arr[i] > arr[j]) {
                   max_len_arr[i] = Math.max(max_len_arr[i], max_len_arr[j]+1); //get max for that particular sub problem
                 }
              }
            max_len_sofar = Math.max(max_len_sofar,max_len_arr[i]);  //keep on setting max for global counter after each loop of i
        }
        return max_len_sofar;
    }

    public static void main(String[] args) {
      int res =  findLargestIncreasingSubSequence(new int[]{10, 22, 9, 33, 21, 50, 41, 60 });
        System.out.println(res);
    }
}
