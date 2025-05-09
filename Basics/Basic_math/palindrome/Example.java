import java.util.Scanner;

public class Example {
    public static boolean palindrome(int N){
        int num = N;
        int rev = 0;
        while (num > 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        if (rev == N){
            return true;
        }
        else{
            return false;
        }
    }    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int N = sc.nextInt();

        if (palindrome(N)){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not a palindrome");
        }
    }
    
}
