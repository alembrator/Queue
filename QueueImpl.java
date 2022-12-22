
package queueimpl;

/**
 *
 * @author alhaj Musa
 */
public class QueueImpl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Queue q = new Queue();
       q.enQueue(7);
       q.enQueue(9);
       q.enQueue(6);
       q.enQueue(3);
       q.enQueue(30);
       q.enQueue(99);
       q.enQueue(100);
       System.out.println("The deleted elementis: " + q.deQueue());
       q.printAll();
       System.out.println("The size of the queue : " + q.size());
    }
    
}
