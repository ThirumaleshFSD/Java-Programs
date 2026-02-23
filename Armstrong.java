public class Armstrong {
    public static void main(String[] args) {
        int num = 370;
        int originalNum = num;
        int result = 0;
        while (originalNum != 0) {
            int remainder = originalNum % 10;
            result += Math.pow(remainder, 3);
            originalNum /= 10;
        }
        if (result == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
