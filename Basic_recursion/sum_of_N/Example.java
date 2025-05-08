import java.util.Scanner;

public class Example {
    public static void adding(int num, int sum){
        if (num == 0){
            System.out.println(sum);
            return;
        }
        adding(num-1,sum+num);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        adding(N, 0);
    }
}
