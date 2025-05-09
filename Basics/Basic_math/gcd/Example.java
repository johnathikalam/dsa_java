import java.util.Scanner;

public class Example {

    public static int gcd(int n1, int n2){
        int num = n1 < n2 ? n1 : n2;
        int gcd = 1;
        for (int i = 2; i <= num; i +=1 ){
            if (n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(gcd(n1, n2));
    }
}
