import java.util.Arrays;
public class Example {
    public static void main(String [] args){

        char [] greeting = {'H', 'E', 'L', 'L', 'O'};
        String str = new String(greeting);
        System.out.println("Greeting : " + str);    //HELLO

        System.out.println("Length : " + str.length()); //5

        str = str.concat(" WORLD");
        System.out.println("Greeting : " + str);    //HELLO WORLD

        System.out.println(str.charAt(5));

        System.out.println(str.codePointAt(5)); //32

        System.out.println(str.codePointBefore(5)); //79

        System.out.println(str.codePointCount(0, 5));   //5

        System.out.println("Compare : " + str.compareTo("HELLO WORLD"));    //0

        System.out.println("Compare ignorecase : " + str.compareToIgnoreCase("hello World"));  //0

        System.out.println("Contains : " + str.contains("hello"));  //false

        System.out.println("Copy value : " + str.copyValueOf(greeting));    //HELLO

        System.out.println("endsWith : " + str.endsWith("LD")); //true

        System.out.println("startsWith : " + str.startsWith("HELLO"));  //true

        System.out.println("Equal : " + str.equals("HELLO WORLD")); //true

        System.out.println("Equal ignorecase : " + str.equalsIgnoreCase("hello World"));    //true

        System.out.println("Hashcode : " + str.hashCode()); //568232580

        System.out.println("indexOf : " + str.indexOf("L"));    //2

        System.out.println("lastIndexof : " + str.lastIndexOf("L"));    //9

        System.out.println("Is empty : " + str.isEmpty());  //false

        str = str.replace("ELLO", "ello");
        System.out.println("Greeting : " + str);    //Hello WORLD

        str = str.replaceAll("L", "l");
        System.out.println("Greeting : " + str);    //Hello WORlD

        str.replaceFirst("l", "L");
        System.out.println("Greeting : " + str);    //Hello WORlD

        String [] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));   //[Hello, WORlD]

        String str1 = str.substring(5);
        System.out.println("Substring : " + str1);  // WORlD

        char [] arr1 = str.toCharArray();
        System.out.println(arr1);   //Hello WORlD

        System.out.println("LowerCase : " + str.toLowerCase()); //hello world

        System.out.println("UpperCase : " + str.toUpperCase()); //HELLO WORLD

        System.out.println("ToString : " + str.toString()); //Hello WORlD

        System.out.println("Trim : " + str.trim()); //Hello WORlD
    }
}
