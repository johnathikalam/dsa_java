import java.util.*;
public class Example{
    public static int longSumBrute(int [] arr, int k){
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++){
            int s = 0;
            for (int j = i; j < arr.length; j++){
                s += arr[j];
                if (s == k && maxLength < j-i+1) maxLength = j-i+1;  
            }
        }
        return maxLength;
    }

    public static int longSumHash(int [] arr, int k){
        Map <Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];

            if (sum == k && maxLength < i+1) maxLength = i+1;

            long rem = sum - k;

            if (preSumMap.containsKey(rem)){
                int len = i - preSumMap.get(rem);
                if (maxLength < len) maxLength = len;
            }

            if (!preSumMap.containsKey(sum)){
                preSumMap.put(sum, i);
            }
        }
        return maxLength;
    }

    public static int longSumTwoPointer(int [] arr, int k){
        long sum = arr[0];
        int i = 0, j = 0;
        int maxLength = 0;
        int n = arr.length;

        while (j < n){
            while (i <= j && sum > k){
                sum -= arr[i];
                i += 1;
            }
            
            if (sum == k && maxLength < j - i + 1) maxLength = j - i + 1;

            j += 1;
            if (j < n ) sum += arr[j];
        }
        return maxLength;
    }

    public static void main(String [] args){
        int [] arr = {2,0,0,0,0,3};
        // int [] arr = {2,3,5,1,9};
        int res = longSumTwoPointer(arr, 3);
        System.out.println(res);
    }

}