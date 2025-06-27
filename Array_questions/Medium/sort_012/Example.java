
public class Example {

    public static int [] sortDigitsCounter(int [] arr){
        int count_0 = 0, count_1 = 0, count_2 = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0) count_0 += 1;
            else if (arr[i] ==1) count_1 += 1;
            else count_2 += 1;
        }

        for (int i = 0 ; i < count_0; i++){
            arr[i] = 0;
        }

        for (int i = count_0 ; i < count_0 + count_1; i++){
            arr[i] = 1;
        }

        for (int i = count_0+count_1 ; i < count_0 + count_1 + count_2; i++){
            arr[i] = 2;
        }

        return arr;
    }
    
    public static int [] sortDigitsDuchFlag(int [] arr){
        int low = 0, mid = 0, high = arr.length-1;
        while (high >= mid){
            if (arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp; 

                mid += 1;
                low += 1;
            }

            if (arr[mid] == 2){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high -= 1;
            }
            
            if (arr[mid] == 1) mid += 1;
        }
        return arr;
    }

    public static void main(String [] args){
        int [] arr = {2,0,2,1,1,0,0,1,1};
        arr = sortDigitsCounter(arr);
        arr = sortDigitsDuchFlag(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }        
    }
}