import java.util.Arrays;
import java.util.List;
public class Example {
    public static void main(String [] args){

        String[] a = new String[]{"abc", "def", "ghi", "jkl", "mon"};
        List<String> list = Arrays.asList(a);
        System.out.println("List : " + list);   //[abc, def, ghi, jkl, mon]

        int arr[] = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}; 
        System.out.println("Array : " + Arrays.toString(arr));  //[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

        Arrays.sort(arr);
        System.out.println("Sorted array : " + Arrays.toString(arr));   //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        System.out.println("Binary search 9 : " + Arrays.binarySearch(arr, 9)); //9

        System.out.println("Comparison : " + Arrays.compare(arr, arr));   //0
        System.out.println("UnsignedComparison : " + Arrays.compareUnsigned(arr, arr));   //0

        int[] arr1 = Arrays.copyOf(arr, 5);
        System.out.println("Copy array : " + Arrays.toString(arr1));    //[0, 1, 2, 3, 4]
        
        int[] arr2 = Arrays.copyOfRange(arr,0, 5); 
        System.out.println("Copy array : " + Arrays.toString(arr2));    //[0, 1, 2, 3, 4]

        System.out.println("Equals : " + Arrays.equals(arr1, arr2)); //true

        System.out.println("Hashcode : " + Arrays.hashCode(arr));   //-1631921466

        String str = Arrays.toString(arr2);
        System.out.println("ToString : " + str);    //[0, 1, 2, 3, 4]
    }
}
