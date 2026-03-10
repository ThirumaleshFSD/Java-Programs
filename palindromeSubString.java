public class palindromeSubString {

    public static void main(String[] args) {

        String s = "telugu";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 3; j <= s.length(); j++) {

                String s1 = s.substring(i, j);

                if (isPal(s1)) {
                    System.out.println(s1);
                }
            }
        }
    }

    public static boolean isPal(String s) {

        String s1 = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            s1 += s.charAt(i);
        }

        return s.equals(s1);
    }
}