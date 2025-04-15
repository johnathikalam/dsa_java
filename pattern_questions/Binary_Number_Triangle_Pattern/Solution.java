import java.util.*;
public class Solution {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        for (int i = 1; i <= repeat; i += 1){
            int start = 1;
            if (i%2 == 0 ){
                start = 0;
            }
            else {
                start = 1;
            }
            for (int j = 0; j < i; j +=1){
                System.out.print(start);
                start = start == 1 ? 0 : 1;
            }
            System.out.println();
        }
    }
}
