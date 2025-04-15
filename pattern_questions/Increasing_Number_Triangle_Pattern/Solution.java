import java.util.*;
public class Solution {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        int num = 1;
        for (int i = 1; i <= repeat; i += 1){
            for (int j = 0; j < i; j += 1){
                System.out.print(num + " ");
                num +=1;
            }
            System.out.println();
        }
    }
}
