import java.util.Scanner;

public class Example{

    public static void func(int num, String name){
        if (num == 0){
            return;
        }
        System.out.println(name);
        func(num-1, name);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();sc.nextLine();
        String name = sc.nextLine();
        func(N, name);
    } 
}