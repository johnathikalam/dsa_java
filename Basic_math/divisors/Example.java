import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Example {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int N = sc.nextInt();
        ArrayList<Integer> divisors = new ArrayList<>();

        int sqrt = (int) Math.sqrt(N);
        for (int i = 1; i <= sqrt; i += 1){
            if (N % i == 0){
                divisors.add(i);
                divisors.add(N/i);
            }
        }
        if (N % Math.sqrt(N) == 0){
            divisors.add(sqrt);
        }
        divisors.sort(null);
        System.out.println(divisors);
    }    
}
