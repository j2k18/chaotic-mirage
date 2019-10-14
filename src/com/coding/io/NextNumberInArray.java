package com.coding.io;

public class NextNumberInArray {

    public static int[] find_next(int [] arr){
        int[]temp1 = new int[arr.length]; //create a new array with same size as given
        int carry=1;
        for (int i=arr.length-1; i>=0 ;i--) {//Run from Right to Left in the given array
            int sum = arr[i]+carry; //If it's first element we added a +1 or from next iteration it's the carry from previous number
            if (sum==10) carry=1; //Happens when the digit is 9
            else carry = 0;       //Happens if the digit is <9
            temp1[i] =  sum%10; //If we divide number less than 10 we get same number else we get 0
        }                       //And here we copy the value, 0 or a  number to the  temp1 array
        if (carry == 1){  //For the cases like 999 , Even after the for loop the carry will still be 1
           int [] temp2 = new int[arr.length+1]; //Create a new temp2 array for having a digit more than given number
                                                  //E.g if the given 999 we have to return 1000
           temp2[0]=1; //set the first element of the array to 1 fo this 999 kinda cases
           return  temp2;
        }
   return temp1;
    }

    public static void main(String[] args) {
        int [] arr = new int[]{9,9,9};
        for (Integer i:find_next(arr) ) {
            System.out.println(i);
        }
    }
}
