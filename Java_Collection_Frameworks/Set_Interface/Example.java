import java.util.HashSet;
import java.util.Set;

public class Example {

  public static void main(String args[]) { 
      int count[] = {34, 22,10,60,30,22};
      Set<Integer> set = new HashSet<>();
      try {
         for(int i = 0; i < 5; i++) {
            set.add(count[i]);
         }
         System.out.println(set);   //[34, 22, 10, 60, 30]
      }
      catch(Exception e) {}
   }
}