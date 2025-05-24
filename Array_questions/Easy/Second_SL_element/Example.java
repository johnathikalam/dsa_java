public class Example {
    public static int [] min_max(int[] arr){
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            if(max < arr[i]) max = arr[i];
            if(min > arr[i]) min = arr[i];
        }
        
        int secMax = Integer.MIN_VALUE, secMin = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length; i++){
            if (secMax < arr[i] && arr[i] != max) secMax = arr[i];
            if (secMin > arr[i] && arr[i] != min) secMin = arr[i];
        }

        int [] res = {secMin, secMax};
        return res;
    }

    public static int[] optimal_min_max(int[] arr){
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int secMin = Integer.MAX_VALUE, secMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]) {
                secMax = max;
                max = arr[i];
            }
            else if (secMax < arr[i] && arr[i] != max) secMax = arr[i];

            if (min > arr[i]) {
                secMin = min;
                min = arr[i];
            }
            else if (secMin > arr[i] && arr[i] != min) secMin = arr[i];
        }

        int [] res = {secMin, secMax};
        return res;

    }
    public static void main(String [] args){
        int [] arr  = {1,3,5,6,3,2,7,5,9,2};
        int [] res = min_max(arr);
        System.out.println(res[0] +" "+  res[1]);

        res = optimal_min_max(arr);
        System.out.println(res[0] +" "+  res[1]);

    }
}
