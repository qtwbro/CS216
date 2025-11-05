package Listing;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CircularList {

    Node head;
    // Insert at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        // Case 1: Empty list
        if (head == null) {
            head = newNode;
            head.next = head;
            head.last = head;
            return;
        }
    // Case 2: Non-empty list
        Node tail = head.last; // get last node
        // Connect the new node
        tail.next = newNode;
        newNode.last = tail;
        newNode.next = head;
        head.last = newNode;
        }

    public void insertBegining(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.last = head;
            return;
        }

        newNode.last = head.last;
        newNode.next = head;

        head.last.next = newNode;

        head.last = newNode;
        head = newNode;
        
    }

    public PrintStream countNodes() {
        Set<Node> seen = new HashSet<>();

        Node current = head;
        while(current != null) {
            if (seen.contains(current)) {
                Node start = current;
                while (true) {
                    current = current.next;
                    if (current == start) {
                        break;
                    }
                    return System.out.printf("There are %d Nodes%n", seen.size());

                }
            }

            seen.add(current);
            current = current.next;

        }
        
        return System.out.printf("There are %d Nodes%n", seen.size());
    }
    // Display list forward

    public void displayForward() {
        if (head == null) {
        System.out.println("List is empty");
        return;
        }
        System.out.print("Forward: ");
        Node current = head;
        do {
        System.out.print(current.data + " <-> ");
        current = current.next;
        } while (current != head);
        System.out.println("(back to head)");
    }

    // Display list backward
    public void displayBackward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("Backward: ");
        Node tail = head.last;
        Node current = tail;
        do {
            System.out.print(current.data + " <-> ");
            current = current.last;
        } while (current != tail);
            System.out.println("(back to tail)");
        }
    // Delete a node by value
    public void delete(int value) {
        if (head == null) return;
        Node current = head;
        // Search for the node to delete
        do {
            if (current.data == value) break;
            current = current.next;
        } while (current != head);
        // Not found
        if (current.data != value) return;
        // Case 1: Only one node
            if (current.next == head && current.last == head) {
                head = null;
                return;
            }
        // Case 2: Deleting head
        if (current == head) {
            head = head.next;
        }
        // Adjust the links
        current.last.next = current.next;
        current.next.last = current.last;
    }
}
