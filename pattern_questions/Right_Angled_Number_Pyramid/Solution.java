import java.util.*;
public class Solution {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        for (int i = 0; i < repeat; i += 1){
            for (int j = 0; j <= i; j += 1){
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
    
}
