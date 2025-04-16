import java.util.*;
public class Solution {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int repeat = sc.nextInt();

        for (int i = repeat; i > 0; i -= 1){
            for (int j = 0 ; j < i; j += 1){
                System.out.print(alpha.charAt(j) + " ");
            }
            System.out.println(); 
        }
    }
}
