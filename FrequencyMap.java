
import java.util.*;

public class FrequencyMap {
    public static void main(String[] args) {
      String a="javaprogram"; 
      String s1="";
      Map<Character,Integer> map=new TreeMap<>();
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }
} 
