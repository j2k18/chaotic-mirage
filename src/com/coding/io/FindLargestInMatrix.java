package com.coding.io;

import java.util.Arrays;
import java.util.stream.Stream;

public class FindLargestInMatrix {

    private  static int findBiggestInMatrix(int[][]mat){

        int num = 0;

        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j <mat.length ; j++) {
                if (mat[i][j]>num) {
                    num = mat[i][j];
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3, 4 },
                { 25, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 30 } };
          System.out.println(findBiggestInMatrix(mat));
    }
}
