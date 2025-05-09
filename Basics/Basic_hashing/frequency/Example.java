import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Example {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the list : ");
        int n = sc.nextInt();
        System.out.println("Enter the numbers :");
        int [] list = new int[n];

        for (int i = 0; i < n; i += 1){
            list[i] = sc.nextInt();
        }
       

        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < list.length; i += 1){
            if(map.containsKey(list[i])){
                map.put(list[i], map.get(list[i])+1);
            }
            else{
                map.put(list[i], 1);
            }
        }
        
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }    
}
