import java.util.HashMap;
import java.util.Map;

public class Example {
    public static int once_appearing_hashmap(int [] arr){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++){
            int value = map.getOrDefault(arr[i], 0);
            map.put(arr[i], value + 1);
        }

        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            if (i.getValue() == 1) return i.getKey();
        }
        return -1;
    }
    public static int once_appearing_XOR(int [] arr){
        int XOR = 0;
        for (int i = 0; i < arr.length; i++){
            XOR ^= arr[i];
        }    
        return XOR;
    }
    public static void main(String [] args){
        int [] arr = {4,1,2,1,2};
        int res = once_appearing_XOR(arr);
        System.out.println(res);
    }    
}
