import java.util.HashMap;
import java.util.Map;

public class Example{

    public static int majorityElementHashMap(int [] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            int cnt = map.getOrDefault(arr[i], 0);
            map.put(arr[i], cnt + 1);
        }

        for(Map.Entry<Integer, Integer> it : map.entrySet()){
            if (it.getValue() > n/2) return it.getKey();
        }
        return -1;
    }

    public static int majorityElementMooresVoting(int [] arr){
        int cnt = 0, element = -1;

        for (int i = 0; i < arr.length; i++){
            if (cnt == 0){
                cnt = 1;
                element = arr[i];
            }
            else if (element == arr[i]) cnt += 1;
            else cnt -= 1;
        }
        return element;
    }
    public static void main (String [] args){
        int [] arr = {4,4,2,4,3,4,4,3,2,4};
        // int res = majorityElementHashMap(arr);
        int res = majorityElementMooresVoting(arr);
        System.out.println(res);
    }
}