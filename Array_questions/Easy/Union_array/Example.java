import java.util.ArrayList;
import java.util.Arrays;

public class Example {
    public static ArrayList<Integer> union(int [] arr1, int [] arr2){
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = 0;
        int n = arr1.length, m = arr2.length;
        while (i < n && j  < m){
            if (arr1[i] <= arr2[j]){
                if (res.isEmpty() || res.get(res.size()-1) != arr1[i]){
                    res.add(arr1[i]);
                    i++;
                }else i++;
            }
            else if (res.isEmpty() || res.get(res.size()-1) != arr2[j]){
                res.add(arr2[j]);
                j++;
            } else j++;
        }
        while (i < n){
            if (res.get(res.size()-1) != arr1[i]){
                res.add(arr1[i]);
                i++;
            }else i++;
        }
        while (j < m){
            if (res.get(res.size()-1) != arr2[j]){
                res.add(arr2[j]);
                j++;
            }else j++;
        }
        return res;
    }
    public static void main(String [] args){
        int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int [] arr2 = {2,3,4,4,5,11,12};
        ArrayList<Integer> res = union(arr1, arr2);
        
        for (Integer integer : res) {
            System.out.print(integer+ " ");
        }
    }    
}
