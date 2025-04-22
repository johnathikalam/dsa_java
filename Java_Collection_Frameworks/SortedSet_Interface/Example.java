import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Iterator;
public class Example {
    public static void main(String [] args){
        SortedSet<String> set = new TreeSet<>();
        set.add("b");
        set.add("c");
        set.add("a");

        set.remove("a");
        
        Iterator it = set.iterator();
        while (it.hasNext()) {        
            Object element = it.next();
            System.out.println(element.toString());
        }

        set.clear();
        System.out.println(set);
    }
}
