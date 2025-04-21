import java.util.Queue;
import java.util.LinkedList;

public class Example{
    public static void main(String [] args){
        Queue<Integer> q = new LinkedList<>();
        q.add(10);  //add element to list
        q.add(20);
        q.add(30);
        System.out.println("Queue :"+q);
        
        System.out.println("Element :"+q.element());    //retrive head but doesn't remove head

        System.out.println("Peek :"+q.peek());   //retrive head, but doesn't remove head and returns null if queue is empty
        System.out.println("Queue :"+q);

        System.out.println("Poll :"+q.poll());   //retrives and remove head, also returns null if queue is empty 
        System.out.println("Queue :"+q);

        System.out.println("Remove :"+q.remove()); //retrive and remove head
        System.out.println("Queue :"+q);

        System.out.println("Size :"+q.size());   //returns the size of queue
    }
}