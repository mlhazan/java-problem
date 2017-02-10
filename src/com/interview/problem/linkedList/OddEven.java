
package com.interview.problem.linkedList;

public class OddEven {

    private Node head;

    private static class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;

        }
    }

    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = node;
        }
    }


    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.format("%d ", temp.value);
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node oddEvenList(Node head) {
        if(head == null)
            return head;

        Node result = head;
        Node p1 = head;
        Node p2 = head.next;
        Node connectNode = head.next;

        while(p1 != null && p2 != null && p2.next != null){

            p1.next = p2.next;
            p1 = p1.next;

            p2.next = p1.next;
            p2 = p2.next;
        }

        p1.next = connectNode;

        return result;
    }
    public static void main(String[] args) {
        OddEven list = new OddEven();
        // Creating a linked list
        Node head = new Node(1);
        list.addToTheLast(head);
        list.addToTheLast(new Node(2));
        list.addToTheLast(new Node(3));
        list.addToTheLast(new Node(4));
        list.addToTheLast(new Node(5));

        list.printList(head);
        //Reversing LinkedList
        Node oddFirst = oddEvenList(head);
        System.out.println("After odd even replaced");
        list.printList(oddFirst);

    }
}

