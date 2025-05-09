
public class Example {

    public static void printfunc(int num){
        if (num == 0){
            return;
        }
        printfunc(num-1);
        System.out.println(num);
        return;
    }
    public static void main(String[] args){
        printfunc(10);
    }    
}