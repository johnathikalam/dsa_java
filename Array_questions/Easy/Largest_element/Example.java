public class Example {

    public static int max_element(int [] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]) max = arr[i];
        }
        return max;
    }
    public static void main(String [] args){
        int [] arr  = {1,3,5,6,3,2,7,5,9,2};
        System.out.println(max_element(arr));
    }
}
