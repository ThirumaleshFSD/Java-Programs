class Mits extends RuntimeException{
    Mits(String s){
        super(s);
    }
}
public class CustomException {
    public static void main(String[] args) {
        
        try {
            System.err.println(10/0);
            
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
        
    }
}
