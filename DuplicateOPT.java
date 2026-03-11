import java.util.HashMap;

public class DuplicateOPT {
    public static void main(String[] args) {
          String s="aaddcebff";
     HashMap<Character,Integer> map=new HashMap<Character,Integer>();
     for(char ch:s.toCharArray()){
         map.put(ch,map.getOrDefault(ch,0)+1);
     }
     System.out.println(map);
     for(char ch:s.toCharArray()){
         if(map.get(ch)==1){
             System.out.println(ch);
            //  break;
         }
     }
    }
}
