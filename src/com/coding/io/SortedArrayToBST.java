package com.coding.io;

public class SortedArrayToBST {

    class  Node{
        Node left;
        Node right;
        int value;
        public Node(int value){
            this.value = value;
        }
    }

    private static Node convertToBST(int[]arr){
        return new SortedArrayToBST().toBST(arr,0,arr.length-1);
    }

    private  Node toBST(int[] arr, int start, int end) {

           if (start>end)
               return null;
           int mid = (start+end)/2;
           Node node = new Node(arr[mid]);

           node.left=toBST(arr,start,mid-1);
           node.right=toBST(arr,mid+1, end);

         return node;
    }

    public static void main(String[] args) {
       Node root= convertToBST(new int[]{1,2,3,4,5,6,7,8,9});
        printInOrder(root);

    }

    private static void printInOrder(Node node) {

        if (node == null)
            return;
        printInOrder(node.left);
        System.out.println(node.value);
        printInOrder(node.right);

    }
}
