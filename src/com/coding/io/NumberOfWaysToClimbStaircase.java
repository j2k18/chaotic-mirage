package com.coding.io;

class NumberOfWaysToClimbStaircase {

    public static int num_ways(int s){
        if (s<=1)
            return 1;
        return  num_ways(s-1)+num_ways(s-2);
    }

    public static void main(String[] args) {
        int s = 4; //Given number of stares are 4 How many ways to reach there
                   //E.g
        System.out.println(num_ways(s));
    }
}
