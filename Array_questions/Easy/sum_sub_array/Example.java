public class Example{
    public static int long_sum_brute(int [] arr, int k){
        int long_length = 0;
        for (int i = 0; i < arr.length; i++){
            int s = 0;
            for (int j = i; j < arr.length; j++){
                s += arr[j];
                if (s == k && long_length < j-i+1) long_length = j-i+1;  
            }
        }
        return long_length;
    }

    public static void main(String [] args){
        int [] arr = {2,3,5,1,9};
        int res = long_sum_brute(arr,10);
        System.out.println(res);
    }

}