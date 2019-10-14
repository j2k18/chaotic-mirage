package com.coding.io;

public class PrintTreeZigzag {
    Node root;


    private void printZigzag(Node root) {

        int treeHeight = getHeightofTree(root);
        boolean ltr = false;
        PrintTreeZigzag tree = new PrintTreeZigzag();

        for (int i = 0; i < treeHeight; i++) {
            tree.printAtKDistance(root, i, ltr);
            ltr = !ltr;
        }

    }


    private int getHeightofTree(Node node) {

        if (node == null)
            return 0;
        int lheight = getHeightofTree(node.left);
        int rheight = getHeightofTree(node.right);

        if (lheight > rheight)
            return (lheight + 1);
        else
            return (rheight + 1);
    }



    private void printAtKDistance(Node node, int k, boolean ltr) {
        if (node == null)
            return;
        if (k == 0) {
            System.out.println(node.value);
        } else {
            if (ltr) {
                printAtKDistance(node.left, k - 1, ltr);
                printAtKDistance(node.right, k - 1, ltr);
            } else {
                printAtKDistance(node.right, k - 1, ltr);
                printAtKDistance(node.left, k - 1, ltr);
            }

        }
    }


    public static void main(String[] args) {
        PrintTreeZigzag tree = new PrintTreeZigzag();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(7);
        tree.root.left.right = new Node(6);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(4);
        tree.printZigzag(tree.root);
    }

}
