import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static int partition(List<Integer> arr, int low, int high){
        int pivot = arr.get(low);
        int left = low;
        int right = high;
        while (left < right){
            while (arr.get(left) <= pivot && left < high) left++;
            while (arr.get(right) >= pivot && right > low) right--;
            if (left < right){
                int temp = arr.get(left);
                arr.set(left, arr.get(right));
                arr.set(right, temp);
            }
        }
        int temp = arr.get(low);
        arr.set(low, arr.get(right));
        arr.set(right, temp);
        return right;
    }

    public static void qs(List<Integer> arr, int low, int high){
        if(low < high){
            int p = partition(arr, low, high);
            qs(arr, low, p-1);
            qs(arr, p+1, high);
        }
    }

    public static List<Integer> quick_sort(List<Integer> arr){
        qs(arr, 0, arr.size() - 1);
        return arr;
    }
    public static void main(String [] args){
        List<Integer> arr = new ArrayList<>();
        arr = Arrays.asList(new Integer[] {5,3,6,7,8,3,1,9,7,2});
        arr = quick_sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }     
}