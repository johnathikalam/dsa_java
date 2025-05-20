
public class Example {
    public static void bubble_sort(int [] arr, int n){
        if(n==1) return;
        boolean didSwap = false;
        for (int j = 0; j <= n-2; j += 1){
            if (arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                didSwap = true;
            }
        }
        if (!didSwap) return;
        bubble_sort(arr, n-1);
    }

    public static void main(String [] args){
        int [] arr = {5,3,6,7,8,3,1,9,7,2};
        bubble_sort(arr,arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }     
}
