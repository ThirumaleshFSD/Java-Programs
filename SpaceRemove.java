public class SpaceRemove {
    public static void main(String[] args) {
        String s="   java  is                     easy  ";
        String[] s1=s.split(" ");
        String result="";
        for(String str : s1){
            if(!str.isEmpty()){
                result+=str+" ";
            }
        }
        System.out.println(result.trim());
    }
}
