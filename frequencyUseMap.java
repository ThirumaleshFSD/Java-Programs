import java.util.HashMap;
import java.util.Map;

public class frequencyUseMap {
   public static void main(String[] args) {
       int a[]={1,1,2,5,7,2,5,1};
       HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
       for(Integer e:a){
          map.put(e,map.getOrDefault(e , 0)+1);
       }
       System.out.println(map);
     
   } 
}
