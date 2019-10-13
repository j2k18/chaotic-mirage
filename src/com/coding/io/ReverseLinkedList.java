package com.coding.io;

public class ReverseLinkedList {

       ListNode head=null;


       public  ListNode reverse(ListNode node){    // 85 -> 15 -> 4 -> 20
           ListNode current = node;
           ListNode previous = null;
           ListNode next = null;

           while (current != null){
               next = current.next;
               current.next=previous;
               previous=current;
               current=next;
           }
        return  previous;
       }


       public  void printList(ListNode node){

            while (node !=null){
                System.out.println("Value : "+node.value);
                node = node.next;
            }

       }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
       ListNode headNode= list.head = new ListNode(85);
        list.head.next = new ListNode(15);
        list.head.next.next = new ListNode(4);
        list.head.next.next.next = new ListNode(20);

        System.out.println("Given Linked list");
        list.printList(headNode);
        headNode = list.reverse(headNode);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(headNode);
    }
}
