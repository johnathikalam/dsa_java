import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class Example {
    public static void main(String [] args){
        Map<String, Integer> m1 = new HashMap<>();  //implemented using HashMap
        Map<String, Integer> m2 = new TreeMap<>();  //implemented using TreeMap

        m1.put("John", 22); //to add key value pair
        m1.put("Joseph", 29);
        m1.put("Zara", 8);
        m1.put("Mahnaz", 31);
        m1.put("Ayan", 12);
        m1.put("Daisy", 14);
        System.out.println("Map m1: " + m1);

        m2.putAll(m1);  //to add multiple key value pairs
        System.out.println("Map m2: " + m2);

        System.out.println("ContainsValue : " + m1.containsValue(22));  //return true if value is present else false
        System.out.println("ContainsValue : " + m1.containsValue(2));


        System.out.println("ContainsKey : " + m1.containsKey("John"));  //return true if key is present else false
        System.out.println("ContainsKey : " + m1.containsKey("Jo"));

        System.out.println("Entryset : " + m1.entrySet());  //return entrySet of map

        System.out.println("Equals : " + m1.equals(m2));    //check whether the key value pairs in m2 is in the m1

        System.out.println("Get  : "+ m1.get("John"));  //return value of given key



        System.out.println(m1.hashCode());  //return hashcode for map

        System.out.println(m1.isEmpty());   //check whether the map is empty or not

        System.out.println(m1.keySet());    //return keyset

        System.out.println("Size : " + m1.size());  //return size of map

        System.out.println("Remove : " + m1.remove("John"));    //remove the key value pair

        System.out.println("Values : " + m1.values());  //return the list of values
    }  
}
