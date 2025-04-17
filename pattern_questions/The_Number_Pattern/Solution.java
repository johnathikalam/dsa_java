import java.util.*;
public class Solution {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();

        for (int i = repeat; i > 1; i -= 1){
            for(int j = repeat; j > 0; j -= 1){
                if (j <= i){
                    System.out.print(i+ " ");
                }
                else{
                    System.out.print(j+ " ");
                }
            }
            for(int j = 2; j <= repeat; j += 1){
                if (j <= i){
                    System.out.print(i+ " ");
                }
                else{
                    System.out.print(j+ " ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= repeat; i += 1){
            for(int j = repeat; j > 0; j -= 1){
                if (j <= i){
                    System.out.print(i+ " ");
                }
                else{
                    System.out.print(j+ " ");
                }
            }
            for(int j = 2; j <= repeat; j += 1){
                if (j <= i){
                    System.out.print(i+ " ");
                }
                else{
                    System.out.print(j+ " ");
                }
            }
            System.out.println();
        }
    }
}
