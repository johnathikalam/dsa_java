import java.util.*;

public class Solution{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        for (int i = 0; i < repeat; i+=1){
            for (int j = 0; j < repeat; j +=1){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}