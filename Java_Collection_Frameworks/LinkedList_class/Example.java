import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class Example {
    public static void main(String [] args){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(20);
        ll.add(15);
        ll.add(23);
        ll.add(2, 34);
       System.out.println(ll);  //[20, 15, 34, 23]

       ll.addAll(Arrays.asList(58,75,65));
       System.out.println(ll);  //[20, 15, 34, 23, 58, 75, 65]

       ll.addFirst(29);
       System.out.println(ll);  //[29, 20, 15, 34, 23, 58, 75, 65]

       ll.addLast(54);
       System.out.println(ll);  //[29, 20, 15, 34, 23, 58, 75, 65, 54]

       System.out.println(ll.contains(20)); //true

       Iterator<Integer> iterator = ll.descendingIterator();
       iterator.forEachRemaining(i -> System.out.print(i + " "));   //54 65 75 58 23 34 15 20 29

       System.out.println(ll.element());    //29

       System.out.println(ll.get(5));   //58

       System.out.println(ll.getFirst());   //29

       System.out.println(ll.getLast());    //54

       System.out.println(ll.indexOf(15));  //2

       System.out.println(ll.lastIndexOf(75));  //6

       ListIterator<Integer> iter = ll.listIterator();
       iter.forEachRemaining(i -> System.out.print(i + " "));   //29 20 15 34 23 58 75 65 54

       

    }
    
}
