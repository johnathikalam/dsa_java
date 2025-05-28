public class Example {
    public static void reverse(int[] arr, int start, int end){
        while (start < end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++; end--;
        }
    }
    
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int len = arr.length;
        int k=2;
        reverse(arr, 0, k-1);
        reverse(arr, k, len-1);
        reverse(arr, 0, len-1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
