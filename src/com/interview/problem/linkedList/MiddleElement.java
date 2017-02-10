
package com.interview.problem.linkedList;


public class MiddleElement {
    public MiddleElement next;
    public int value;

    public MiddleElement(int value) {
        this.value = value;
    }

    public void appendToTail(int value) {
        MiddleElement end = new MiddleElement(value);
        MiddleElement temp = this;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = end;
    }

    public static void main(String[] args) {

        MiddleElement head = new MiddleElement(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(5);


        MiddleElement current = head;
        MiddleElement middle = head;

        while (current.next != null && current.next.next !=null) {
            current = current.next.next;
            middle = middle.next;

        }
        System.out.println("Middle Element :" + middle.value);
    }
}

