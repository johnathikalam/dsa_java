import java.util.*;
public class Solution {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        for (int i = 1; i <= repeat; i +=1){
            for (int j = 1; j <= i; j +=1){
                System.out.print(j);
            }
            System.out.print(" ".repeat((repeat-i )*2));
            for (int j = i; j > 0; j -=1){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
