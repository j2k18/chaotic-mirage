package com.coding.io;

import java.util.Stack;

public class LongestValidParanthesis {

    static int longestValid(String str){

        int max=0;

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(-1);

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(')
                 stack.push(i);
            else{
                stack.pop();
                if (!stack.empty())
                    max = Math.max(max,i - stack.peek());
                else
                    stack.push(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "}(())(){";
        System.out.println(longestValid(s));
    }
}
