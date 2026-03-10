import java.util.*;

public class SbuString {
    public static void main(String[] args) {

        String s = "abdafrd";

        String min1 = s;
        String min2 = s;

        for(int i = 0; i < s.length(); i++) {

            String s1 = "";

            for(int j = i; j < s.length(); j++) {

                if(s1.indexOf(s.charAt(j)) == -1) {
                    s1 += s.charAt(j);
                } else {
                    break;
                }
            }

            System.out.println(s1);

            if(s1.length() < min1.length()) {
                min2 = min1;
                min1 = s1;
            }
            else if(s1.length() < min2.length() && !s1.equals(min1)) {
                min2 = s1;
            }
        }

        System.out.println("Min substring = " + min1);
        System.out.println("Second Min substring = " + min2);
    }
}