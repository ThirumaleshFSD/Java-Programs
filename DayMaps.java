import java.util.*;
public class DayMaps {
    public static void main(String[] args) {
        // List<Integer> list = Arrays.asList(10,20,30,40);
        Map<String,Object> map = new TreeMap<>();
        
      
        map.put("id3",103); 
        map.put("name","siri");
          map.put("id2",102);
          map.put("id1",101);
          map.put("IP","192.168.1.1");
        for(Object e:map.values()){
            System.out.println(e);
            }
    
  System.out.println(map);
}
}
