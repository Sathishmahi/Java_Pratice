import java.util.*;

/*
 HashSet -- donot allow the duplicate values and not maintain order

 LinkedSet --- donot allow the duplicate values and maintain order
 
 */

public class Collections_Hashset {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        hs.add("sathish");
        hs.add("sathish");
        hs.add("kumar");
        hs.add("sathish");
        hs.add("mani");
        hs.add("jai");

        System.out.println(hs);
    }
}
