import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Example{
    public static void main(String [] args){
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        
        list1.add(0,10);
        list1.add(20);
        System.out.println("Added items : " + list1);   //[10, 20]

        list1.addAll(list2);
        System.out.println("Combined list : " + list1); //[10, 20, 1, 2, 3, 4, 5, 6, 7]

        System.out.println("Value at index 3 : " + list1.get(3));   //2
        System.out.println("Index of 5 : " + list1.indexOf(5));   //6

        System.out.println(list1.lastIndexOf(20));  //1

        list1.remove(5);   
        System.out.println("remove(5) : " + list1); //[10, 20, 1, 2, 3, 5, 6, 7]

        list1.set(3,40);
        System.out.println("Replaced at 3 with 40 : " + list1); //[10, 20, 1, 40, 3, 5, 6, 7]

        list2= list1.subList(1,5);
        System.out.println("Sliced from 1 - 5 : " + list2); //[20, 1, 40, 3]
    }
}