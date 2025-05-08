import java.util.Scanner;

public class Example {

    public static boolean armstrong(int N){
        int num = N;
        int cube = 0;
        while (num > 0){
            int rem = num % 10;
            cube += rem * rem * rem; 
            num /= 10;
        }
        if (cube == N){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int N = sc.nextInt();

        System.out.println(armstrong(N));
    }    
}
