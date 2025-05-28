public class Example {
    public static int linear_search(int [] arr, int element){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == element) return i;
        }
        return -1;
    }
    public static void main(String [] args){
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int index = linear_search(arr, 5);
        System.out.println(index);
    }    
}
