import java.util.*;
public class Solution {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        for (int i = repeat; i > 0; i -=1){
            for (int j = i; j > 0; j -=1){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
