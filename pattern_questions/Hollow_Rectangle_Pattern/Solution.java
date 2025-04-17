import java.util.*;
public class Solution {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();

        for (int i = 0; i < repeat; i +=1 ){
            if (i == 0 || i == repeat-1){
                System.out.print("*".repeat(repeat));
                System.out.println();
            }
            else {
                System.out.print("*");
                System.out.print(" ".repeat(repeat-2));
                System.out.print("*");
                System.out.println();
            }
        }
    }
}
