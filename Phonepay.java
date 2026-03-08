
abstract class Payment {
    abstract void pay();
    abstract void display();

}
class Accessing extends Payment {
    @Override
    void pay() {
        System.out.println("Payment done through Phonepay");
    }
    
   @Override
    void display() {
        System.out.println("Payment method: Phonepay");
    }

}
public class Phonepay {

    public static void main(String[] args) {
        Payment p = new Accessing(); 
        p.pay();
        p.display();
    }
    
}

