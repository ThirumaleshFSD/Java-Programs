// import java.lang.classfile.attribute.SyntheticAttribute;
import com.sun.jdi.connect.Connector;
import java.util.*;
public class KeyValues {
    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<>();
        // map.put("apple", 1);
        // map.put("apple",1);
        map.put("orange", 4);
        map.put("banana", 3);
       
         map.put("apple", 1);
         for(Integer i:map.values()){
            System.out.println(i);
         }
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"== "+entry.getValue());
        }   
    }
}
