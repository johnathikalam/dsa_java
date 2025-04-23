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
        System.out.println("Map m1: " + m1);    //{Joseph=29, John=22, Daisy=14, Ayan=12, Zara=8, Mahnaz=31}

        m2.putAll(m1);  //to add multiple key value pairs
        System.out.println("Map m2: " + m2);    //{Ayan=12, Daisy=14, John=22, Joseph=29, Mahnaz=31, Zara=8}

        System.out.println("ContainsValue : " + m1.containsValue(22));  //true, return true if value is present else false
        System.out.println("ContainsValue : " + m1.containsValue(2));   //fasle


        System.out.println("ContainsKey : " + m1.containsKey("John"));  //true, return true if key is present else false
        System.out.println("ContainsKey : " + m1.containsKey("Jo"));    //false

        System.out.println("Entryset : " + m1.entrySet());  //[Joseph=29, John=22, Daisy=14, Ayan=12, Zara=8, Mahnaz=31], return entrySet of map

        System.out.println("Equals : " + m1.equals(m2));    //true, check whether the key value pairs in m2 is in the m1

        System.out.println("Get  : "+ m1.get("John"));  //22, return value of given key

        System.out.println(m1.hashCode());  //299802750, return hashcode for map

        System.out.println(m1.isEmpty());   //false, check whether the map is empty or not

        System.out.println(m1.keySet());    //[Joseph, John, Daisy, Ayan, Zara, Mahnaz], return keyset

        System.out.println("Size : " + m1.size());  //6, return size of map

        System.out.println("Remove : " + m1.remove("John"));    //22, remove the key value pair

        System.out.println("Values : " + m1.values());  //[29, 14, 12, 8, 31], return the list of values
    }  
}
