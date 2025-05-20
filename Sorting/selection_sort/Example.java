public class Example {
    public static int [] selection_sort(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i += 1){
            int min = i;
            for (int j = i + 1; j < n; j += 1 ){
                if (arr[min] > arr[j] ){
                    min = j;
                }
             }
             int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[] args){
        int [] arr = {5,3,6,7,8,3,1,9,7,2};
        arr = selection_sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
}
