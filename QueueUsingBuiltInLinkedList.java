package queueusingbuiltinlinkedlist;
 import java.util.LinkedList;
 public class QueueUsingBuiltInLinkedList {
    private final LinkedList lq = new LinkedList<>();
    public void enqueue(int item) {
        lq.addLast(item);
    }
    public int dequeue() {
        return (int) lq.removeFirst();
    }
    public int peek() {
        return (int) lq.getFirst();
    }
    public void print() {
        System.out.println(lq);
    }
    public static void main(String[] args) {
        QueueUsingBuiltInLinkedList queue = new QueueUsingBuiltInLinkedList();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.print();
        System.out.println(queue.peek());
        queue.dequeue();
        queue.print();
        queue.enqueue(40);
        queue.print();
        queue.dequeue();
        queue.print();
    }
 }