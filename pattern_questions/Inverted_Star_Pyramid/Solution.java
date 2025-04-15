import java.util.*;
public class Solution {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        for (int i = 0; i < repeat; i += 1){
            System.out.print(" ".repeat(i));
            System.out.print("*".repeat((repeat-i-1)*2+1));
            System.out.println();
        }
    }
}
