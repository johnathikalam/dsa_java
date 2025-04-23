import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
public class Example {
    public static void main(String [] args){
        SortedMap<String, Integer> m = new TreeMap<>();

        m.put("John", 20);
        m.put("Daniel", 17);
        m.put("Jackson", 3);
        m.put("John", 22);
        m.put("Joseph", 29);
        m.put("Zara", 8);
        m.put("Mahnaz", 31);
        m.put("Ayan", 12);
        m.put("Daisy", 14);
        System.out.println("Map : " + m);   //{Ayan=12, Daisy=14, Daniel=17, Jackson=3, John=22, Joseph=29, Mahnaz=31, Zara=8} 

        m.remove("John");
        System.out.println("Map : " + m); //{Ayan=12, Daisy=14, Daniel=17, Jackson=3, Joseph=29, Mahnaz=31, Zara=8} 


        System.out.println(m.get("John"));  //null

        Set<Map.Entry<String, Integer>> set = m.entrySet();
        Iterator<Map.Entry<String, Integer>> i = set.iterator();
        while(i.hasNext()) {
            Map.Entry<String, Integer> me = i.next();
            System.out.print(me.getKey() + " " + me.getValue() + "  ");  // Ayan 12  Daisy 14  Daniel 17  Jackson 3  Joseph 29  Mahnaz 31  Zara 8
        }
    }
}
