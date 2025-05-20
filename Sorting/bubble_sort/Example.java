
public class Example {
    public static int [] bubble_sort(int [] arr){
        int n = arr.length;
        boolean didSwap = false;
        for (int i = n-1; i >= 0; i -= 1){
            for (int j = 0; j <= i-1; j += 1){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = true;
                }
            }
            if (!didSwap){
                break;
            }
        }
        return arr;
    }
    public static void main(String [] args){
        int [] arr = {5,3,6,7,8,3,1,9,7,2};
        arr = bubble_sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }     
}
