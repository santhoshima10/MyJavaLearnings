import java.util.LinkedList;

public class NewQueue {

    LinkedList queue;

    public NewQueue(){
        queue = new LinkedList();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public int size(){
        return queue.size();
    }

    public void enqueue(int data){
        queue.addLast(data);
    }

    public int dequeue(){
        return  (int)queue.removeFirst();
    }

    public int peek(){
        return (int)queue.getFirst();
    }

    public static void main(String[] args){

        NewQueue testQueue = new NewQueue();
        testQueue.enqueue(1);
        testQueue.enqueue(9);
        testQueue.enqueue(7);
        System.out.println(testQueue.dequeue());
        System.out.println(testQueue.dequeue());
        System.out.println(testQueue.size());
        System.out.print(testQueue.peek());

    }
}
