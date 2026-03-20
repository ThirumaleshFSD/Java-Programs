public class AutomorphicRecursion {

    static boolean isAutomorphic(int n, int sq) {
        // Base case: if number becomes 0 → all digits matched
        if (n == 0) {
            return true;
        }

        // If last digits don't match → not automorphic
        if ((n % 10) != (sq % 10)) {
            return false;
        }

        // Recursive call by removing last digit
        return isAutomorphic(n / 10, sq / 10);
    }

    public static void main(String[] args) {
        int n = 25;
        int sq = n * n;
 //changed
        if (isAutomorphic(n, sq)) {  





  System.out.println(n + " is Automorphic");
        } else {
            System.out.println(n + " is Not Automorphic");
        }
    }
}