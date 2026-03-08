abstract class Payment {
    abstract void checkBalence();
    abstract void payAnyone();
    abstract void statements();
}
abstract class Gpay extends Payment {
     
    abstract void  Upi();
    abstract void  Rewards();
    // abstract void token();
}
class details extends Gpay {
    // int pric1 = 1000;
    @Override
    void checkBalence() {
        System.out.println("Balence is 1000");
    }
    @Override
    void payAnyone() {
        System.out.println("Payment is successful");
    }
    @Override
    void statements() {
        System.out.println("Statements are available");


} 
    @Override
    void Upi() {
        System.out.println("UPI is available");
    }
    @Override
    void Rewards() {
        System.out.println("Rewards are available");
    }
}
public class Abst {
    public static void main(String[] args) {
        details p = new details();
        p.checkBalence();
        p.payAnyone();
        p.statements();
        p.Upi();
        p.Rewards();
    }
}
