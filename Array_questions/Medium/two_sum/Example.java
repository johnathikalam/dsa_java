import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class Example{
    public static int [] twoSumWorst(int [] arr, int k){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[i] + arr[j] == k && i != j) return new int [] {i,j};
            }
        }
        return new int [] {-1, -1};
    }

    public static int [] twoSumHash(int [] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            int val = k - arr[i];
            if (map.containsKey(val) && map.get(val) != i) return new int[] {map.get(val), i};
            map.put(arr[i], i); 
        }
        return new int[] {-1, -1};
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = {2,6,5,8,11};
        int k = 14;
        int [] res = twoSumHash(arr , k);
        if (res[0] != -1 || res[1] != -1){
            System.out.println("YES");
            System.out.println("["+res[0]+ ", "+res[1]+"]");
        }
        else {
            System.out.println("NO");
            System.out.println("[-1, -1]");
        }
    }
}