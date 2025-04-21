import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Example{
    public static void main(String [] args){
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        
        list1.add(0,10);    // Add element to given index
        list1.add(20);  //add element to the end of the list
        System.out.println("Added items : " + list1);

        list1.addAll(list2);    //add list2 to the list1
        System.out.println("Combined list : " + list1);

        System.out.println("Value at index 3 : " + list1.get(3));   //to retrive element at given index

        System.out.println("Index of 5 : " + list1.indexOf(5));   // to retrive the index of an element at first instance

        System.out.println(list1.lastIndexOf(20));  //to retrive the index of the element at last instance

        list1.remove(5);    //remove element at given index
        System.out.println("remove(5) : " + list1);

        list1.set(3,40);    //to replace the value at given index
        System.out.println("Replaced at 3 with 40 : " + list1);

        list2= list1.subList(1,5); //to return the list start from given start index to end index
        System.out.println("Sliced from 1 - 5 : " + list2);
    }
}