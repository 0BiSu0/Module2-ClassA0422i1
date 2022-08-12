package ss10_dsa_stack_queue.excercise.queue_implementation_using_circular_linked_list;

public class ImplementQueueByUsingCircularLinkedList {
    static class Node{
        int data;
        Node link;
    }
    static class Queue{
        Node front, rear;
    }
    static void enQueue(Queue q , int value){
        Node temp  = new Node();
        temp.data = value;
        if (q.front == null){
            q.front = q.rear = temp;
        }else {
            q.rear.link = temp;
            q.rear = temp;
            q.rear.link = q.front;

        }
    }
    static void deQueue(Queue q){
        if (q.front == null){
            System.out.println("Queue is Empty!!!");
        }
        if(q.front == q.rear){
            q.front = q.rear = null;
        }else {
            Node temp = q.front;
            q.front = temp.link;
            q.front = q.front.link;
            q.rear.link = q.front;
        }
    }
    static void displayQueue(Queue q){

    }
    public static void main(String[] args) {

    }
}
