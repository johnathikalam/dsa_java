public class Example {
    public static void move_zeros(int[] arr){
        int slow = 0, fast = 0;
        while (fast < arr.length){
            if (arr[fast] != 0){
                int temp = arr[slow];
                arr[slow] = arr[fast];
                arr[fast] = temp;
                slow++; 
            }
            fast++;
        }
        while (slow <arr.length){
            arr[slow] = 0;
            slow++;
        }
    }
    public static void main(String [] args){
        int arr[] = {1,2,0,7,4,0,8,0,4,0,5};
        move_zeros(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }    
}
