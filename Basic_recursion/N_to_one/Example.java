
public class Example {

    public static void printfunc(int num){
        if (num == 0){
            return;
        }
        System.out.println(num);
        printfunc(num-1);
        return;
    }
    public static void main(String[] args){
        printfunc(10);
    }    
}