import java.util.Scanner;

public class Example {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the digit : ");
        int digit = sc.nextInt();
        sc.close();
        int rev = 0;
        boolean flag = true;
        while (digit != 0){
            int num = digit % 10;
            if (flag){
                if (num != 0){
                    flag = false;
                    rev = rev + num;
                }
            }
            else{
                rev = rev * 10 + num;
            }
            digit /= 10;
        }
        System.out.println(rev);
    }
}