
public class Example {
    public static int find_missing_num(int [] arr){
        int XOR1 = 0, XOR2 = 0;
        int N = arr[arr.length-1];
        for (int i = 0; i < N-1; i++){
            XOR1 = XOR1 ^ arr[i];   // XOR of array elements
            XOR2 = XOR2 ^ i+1;  //XOR up to [1...N-1]
        }
        XOR2 = XOR2 ^ N;    //XOR up to [1...N]
        return XOR1 ^ XOR2; // the missing number
    }
    public static void main(String [] args){
        int [] arr = {1,2,3,5,6,7,8};
        int value = find_missing_num(arr);
        System.out.println(value);
    }    
}
