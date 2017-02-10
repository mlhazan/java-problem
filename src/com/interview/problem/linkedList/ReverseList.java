
package com.interview.problem.linkedList;


public class ReverseList {

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

    // Reverse linkedlist using this function
    public static Node reverseLinkedList(Node currentNode) {
// For first node, previousNode will be null
        Node previousNode = null;
        Node nextNode;
        while (currentNode != null) {
            nextNode = currentNode.next;
            // reversing the link
            currentNode.next = previousNode;
            // moving currentNode and previousNode by 1 node
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }

    public static Node reverseSingly(Node head) {
        Node prev = null;
        if (head != null) {

            while (head.next != null) {
                Node next = head.next;
                head.next = prev;
                prev = head;
                head = next;
            }
            head.next = prev;
        }
        return head;
    }

    public static void main(String[] args) {
        ReverseList list = new ReverseList();
        // Creating a linked list
        Node head = new Node(1);
        list.addToTheLast(head);
        list.addToTheLast(new Node(2));
        list.addToTheLast(new Node(3));
        list.addToTheLast(new Node(4));
        list.addToTheLast(new Node(5));

        list.printList(head);
        //Reversing ReverseList
        Node reverseHead=reverseLinkedList(head);
        //Node reverseHead2 = reverseSingly(head);
        System.out.println("After reversing");
        list.printList(reverseHead);
       // list.printList(reverseHead2);
    }
}

