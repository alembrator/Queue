package queueimpl;

/**
 *
 * @author alhaj Musa
 */
public class Queue {

    int queue[] = new int[5];
    //size of the queue
    int size;
    //front of the queue
    int front;
    //rear of the queue
    int rear;

    //Method to insert elements in the queue
    public void enQueue(int data) {
        if (!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % 5;
            size++;
        } else {
            System.out.println("The queue is full");
        }
    }

    //method to print elements of the queue
    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(queue[(front + i) % 5] + " ");
        }
    }

    //method to delet an element from the end of the queue
    public int deQueue() {
        int data = queue[front];
        if (!isEmpty()) {

            size--;
            front = (front + 1) % 5;

        } else {
            System.out.println("Queue is empty");
        }
        return data;
    }

    //get the size of the queue
    public int size() {
        return size;
    }

    //method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    //method to check if the queue is full
    public boolean isFull() {
        return size == 5;
    }

}
