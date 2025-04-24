import java.util.Date;
import java.time.Instant;
public class Example {
    public static void main(String [] args){
        Date date = Date.from(Instant.now());
        System.out.println("ToString : " + date.toString());    //Thu Apr 24 16:14:04 IST 2025

        System.out.println("GetTime : " + date.getTime());  //1745491444967

        Date date1 = new Date(2022, 11, 4);
        System.out.println("After : " + date.after(date1)); //false

        Date date2 = new Date(2026, 11, 4);
        System.out.println("Before : " + date.before(date2));   //true

        System.out.println("Compare : " + date.compareTo(date2));   //-1

        System.out.println("Equals : " + date.equals(date));    //true

        System.out.println("HashCode : " + date.hashCode());    //1734722929

        Instant timestamp = Instant.now();
        System.out.println("Timestamp : " + timestamp); //2025-04-24T10:44:05.057083900Z
    }
}
