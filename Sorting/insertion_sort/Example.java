public class Example {
    public static int [] insertion_sort(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n; i += 1){
            int j = i;
            while (j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;     
            }
        }
        return arr;
    }
    public static void main(String [] args){
        int [] arr = {5,3,6,7,8,3,1,9,7,2};
        arr = insertion_sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }     
}
