import java.util.*;
public class TCSNQtStringAdd {
    public static void main(String[] args) {
        String s1="2947659";
        String s2="1367289";
        int sum1=0; int sum2=0;
       for(int i = 0; i <s1.length(); i++) {
            sum1+=s1.charAt(i)-'0';
            sum2+=s2.charAt(i)-'0';
            
        }
        System.out.println(sum1+sum2);
    }
}
