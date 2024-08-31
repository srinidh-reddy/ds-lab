package queueusinglinkedlist;
 import java.util.ArrayList;
 class LinkedQueue {
    private class Node {
        private final int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
    }
    private Node head;
    private Node tail;
    private int count;
    // O(1)
    public void enqueue(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        count++;
    }
    // O(1)
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        int value;
        if (head == tail) {
            value = head.value;
            head = tail = null;
        } else {
            value = head.value;
            var second = head.next;
            head.next = null;
            head = second;
        }
        count--;
        return value;
    }
    // O(1)
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        return head.value;
    }
    // O(1)
    public int size() {
        return count;
    }
    // O(1)
    public boolean isEmpty() {
        return head == null;
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
 public class QueueUsingLinkedList {
    public static void main(String[] args) {
        LinkedQueue lq = new LinkedQueue();
        lq.enqueue(1);
        lq.enqueue(2);
        lq.enqueue(3);
        lq.enqueue(4);
        lq.enqueue(5);
        System.out.println(lq);
        System.out.println("peeked element -->" + lq.peek());
        System.out.println("Deleted item -->" + lq.dequeue());
        System.out.println(lq);
    }
 }
