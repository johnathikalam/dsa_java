import java.util.Scanner;

public class Example {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the digit : ");
        int digit = sc.nextInt();
        String rev = "";
        boolean flag = true;
        while (digit > 0){
            int num = digit % 10;
            if (flag){
                if (num != 0){
                    flag = false;
                    rev = rev + num;
                }
            }
            else{
                rev = rev + num;
            }
            digit /= 10;
        }
        System.out.println(rev);
    }
}