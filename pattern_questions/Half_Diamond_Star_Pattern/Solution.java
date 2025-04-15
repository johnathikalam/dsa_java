import java.util.*;
public class Solution {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        for (int i = 1; i <= repeat; i += 1){
            System.out.print("*".repeat(i));
            System.out.println();
        }
        for (int i = 1; i < repeat; i += 1){
            System.out.print("*".repeat(repeat-i));
            System.out.println();
        }
    }
}
