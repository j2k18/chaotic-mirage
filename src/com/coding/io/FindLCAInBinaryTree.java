package com.coding.io;

public class FindLCAInBinaryTree {

    Node root =null;


   Node findLCA(int l,int r){
     return findLCA(l,r,root);
   }

   Node findLCA(int l,int r,Node node){
       if (node == null)
           return null;
       if (node.value == l || node.value == r)
           return node;
       Node leftRec = findLCA(l, r, node.left);
       Node rightRec = findLCA(l, r, node.right);

       if (leftRec !=null && rightRec != null)
           return node;
       if(leftRec == null && rightRec==null)
           return null;

       return leftRec!=null?leftRec:rightRec;
   }

    public static void main(String[] args) {
        FindLCAInBinaryTree tree = new FindLCAInBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("LCA(4, 5): " + tree.findLCA(4,5).value);
    }
}
