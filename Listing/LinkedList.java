package Listing;

public class LinkedList {
    Node head;
    Node tail;

    public void insert(int data){
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.last = null;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        
        newNode.last = current;
        current.next = newNode;
        tail = newNode;

    }

    public void display() {
        Node current = head;
        System.out.printf("%nLinked List:");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.printf("null%n");

        System.out.printf("Linked List: ");
        System.out.printf("null ");
        current = tail;
        while (current != null) {
            System.out.print( " <- " + current.data);
            current = current.last;
        }
    }

    public void delete(int value) {
        if (head == null) {
            return;
        }

        if (head.data == value) {
            head = head.next;
            return;
        }

        if (tail.data == value) {
            tail = tail.last;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            current.next.last = current;
        }


    }
}
