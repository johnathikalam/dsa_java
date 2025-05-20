public class Example {
    public static void insertion_sort(int [] arr, int i,int n){
        if (i == n) return;
        int j = i;
        while (j > 0 && arr[j-1] > arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;     
        }
        insertion_sort(arr, i+1, n);
    }
    public static void main(String [] args){
        int [] arr = {5,3,6,7,8,3,1,9,7,2};
        insertion_sort(arr, 0, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }     
}
