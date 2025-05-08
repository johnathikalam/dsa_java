import java.util.Scanner;

public class Example {

    public static boolean prime(int N){
        if(N < 2){
            return false;
        }else {
            for (int i = 2; i <= Math.sqrt(N); i += 1){
                if (N % 2 == 0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(prime(N));
    }
}