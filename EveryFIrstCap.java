public class EveryFIrstCap {
    public static void main(String[] args) {
        String s="java is very is for thiru";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i==0 ||s.charAt(i-1)==' '){
                ch=Character.toUpperCase(ch);
            }
            System.out.print(ch);
        }
    }
}
