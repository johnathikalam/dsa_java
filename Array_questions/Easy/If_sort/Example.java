public class Example {
    public static boolean isSorted(int[] arr){

        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i]> arr[i+1]) return false;
        }
        return true;
    }
    public static void main(String [] args){
        int [] arr = {1,3,5,6,7,8,9};
        System.out.println(isSorted(arr));
    }
}
