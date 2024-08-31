package stackusinglinkedlist;
 // Class to implement stack using a singly linked list
 import java.util.ArrayList;
 class LinkedStack {
    class Node {
        int value;
        Node next;
        Node(int new_data) {
            this.value = new_data;
            this.next = null;
        }
    }
    // Head of the linked list
    Node head;
    // Constructor to initialize the stack
    LinkedStack() {
        this.head = null;
    }
    // Function to check if the stack is empty
    boolean isEmpty() {
        // If head is null, the stack is empty
        return head == null;
    }
    // Function to push an element onto the stack
    void push(int new_data) {
        // Create a new node with given value
        Node new_node = new Node(new_data);
        // Link the new node to the current top node
        new_node.next = head;
        // Update the top to the new node
        head = new_node;
    }
    // Function to remove the top element from the stack
    void pop() {
        // Check for stack underflow
        if (isEmpty()) {
            System.out.println("\nStack Underflow");
            return;
        } else {
            // Assign the current top to a temporary
            // variable
            Node temp = head;
            // Update the top to the next node
            head = head.next;
            // Deallocate the memory of the old top node
            temp = null;
        }
    }
    // Function to return the top element of the stack
    int peek() {
        // If stack is not empty, return the top element
        if (!isEmpty()) {
            return head.value;
        } else {
            System.out.println("\nStack is empty");
            return Integer.MIN_VALUE;
        }
    }
    @Override
    public String toString() {
        ArrayList<Integer> list = new ArrayList<>();
        Node current = head;
        while (current != null) {
            list.add(current.value);
            current = current.next;
        }
        return list.toString();
    }
 }
 public class StackUsingLinkedList {
    public static void main(String[] args) {
        // Creating a stack
        LinkedStack st = new LinkedStack();
        // Push elements onto the stack
        st.push(11);
        st.push(22);
        st.push(33);
        st.push(44);
        System.out.println(st);
        // Print top element of the stack
        System.out.println("Top element is " + st.peek());
        // removing two elemements from the top
        System.out.println("Removing two elements...");
        st.pop();
        st.pop();
        System.out.println(st);
        // Print top element of the stack
        System.out.println("Top element is " + st.peek());
    }
 }