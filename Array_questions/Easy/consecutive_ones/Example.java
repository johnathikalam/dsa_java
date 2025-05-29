public class Example {
    public static int consecutive_ones(int [] arr){
        int max = 0;
        int count = 0;
        for (int i = 0; i <arr.length; i++){
            if(arr[i] != 1){
                if (count > max) max = count;
                count = 0;
            }else count++;
        }
        if (count > max) max = count;
        return max;
    }
    public static void main(String [] args){
        int [] arr = {1,0,4,3,6,1,1,1,1,3,4,1,5,1,1,6,0,1,1,1,0,1,1,1};
        int res = consecutive_ones(arr);
        System.out.println(res);
    }    
}
