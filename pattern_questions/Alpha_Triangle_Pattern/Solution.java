import java.util.*;

public class Solution {
    public static void main(String [] args){
        Scanner sc =  new Scanner(System.in);
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int repeat = sc.nextInt();
        for (int i = 0; i < repeat; i += 1 ){
            for (int j = i; j >= 0; j -= 1){
                System.out.print(alpha.charAt(repeat-j-1)+ " ");
            }
            System.out.println();
        }
    }
}
