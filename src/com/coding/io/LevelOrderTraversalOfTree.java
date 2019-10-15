package com.coding.io;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalOfTree {

    Node root;

    static void travelLevelOrder(Node root){

        Queue<Node>queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node node =  queue.poll();
            System.out.println(node.value);
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                 queue.add(node.right);
        }
    }

    public static void main(String[] args) {
        LevelOrderTraversalOfTree tree = new LevelOrderTraversalOfTree();
       Node rootNode = tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        travelLevelOrder(rootNode);
    }
}
