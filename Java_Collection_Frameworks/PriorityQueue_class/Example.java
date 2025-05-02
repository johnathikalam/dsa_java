import java.util.PriorityQueue;

public class Example {
    public static void main(String [] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(11);
        pq.add(12);
        pq.add(9);
        pq.add(5);
        pq.add(14);

        System.out.println(pq); //[5, 9, 12, 11, 10, 14]

        System.out.println(pq.contains(9));

        pq.forEach(t -> System.out.print(t));   //5912111014
        
        pq.remove();
        System.out.println(pq); //[9, 10, 12, 11, 14]

        pq.removeIf(t -> t % 2 == 0);
        System.out.println(pq); //[9, 11]

        Object[] arr = pq.toArray();
        for (Object t : arr) {
            System.out.print(t+ " ");
        }
    }
}
