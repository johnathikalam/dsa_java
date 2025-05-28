public class Example {
    public static int [] left_rotate(int [] arr){
        int len = arr.length;
        int temp = arr[0];
        for (int i = 0; i < len-1; i++){
            arr[i] = arr[i+1];
        }
        arr[len-1] = temp;
        return arr;
    }
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7,8,9,0};
        arr = left_rotate(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
