import java.util.*;
public class primeWithNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        List<Integer> primes = new ArrayList<>();
        
        for (int i = 2; primes.size() <= num; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        
        System.out.println("First " + num + " prime numbers: " + primes);
    }
    
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}