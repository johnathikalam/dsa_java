import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Example {
    public static void main(String [] args){
        ArrayList al = new ArrayList<>();
        al.add(10);
        al.add(19);
        al.add(8);
        al.add(2);
        al.add(16);
        al.add(4);
        al.add(2);
        al.add(17);
        al.add(2,23);
        System.out.println("List : " + al); //[10, 19, 23, 8, 2, 16, 4, 2, 17]

        System.out.println("Size : " + al.size());  //9

        System.out.println("Remove : " + al.remove(1)); //19
        
        ArrayList al1 = new ArrayList<>();
        al1.addAll(Arrays.asList(9,8,7,6,5,4,3));
        System.out.println("AddAll : " + al1);    //[9, 8, 7, 6, 5, 4, 3]

        System.out.println("Contains : " + al.contains(10));    //true

        System.out.println("Get : " + al.get(7));  //17

        System.out.println("IndexOf : " + al.indexOf(23)); //1

        System.out.println("IsEmpty : " + al.isEmpty());   //false

        System.out.println("LastIndex : " + al.lastIndexOf(2));  //6

        al.set(6,20);
        System.out.println("List : "+ al);  //[10, 23, 8, 2, 16, 4, 20, 17]

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> subList = list.subList(2, 5);
        System.out.println("SubList : " + subList); //[3, 4, 5]

        Object[] array = al1.toArray();
        System.out.println("Array : " + Arrays.toString(array)); //[9, 8, 7, 6, 5, 4, 3]
    }
}
