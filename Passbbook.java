interface Bank {
    void check();
}

interface Gpay extends Bank {
    void pay();
}

interface Paytm extends Bank {
    void statement();
}

class Developer implements Gpay, Paytm {
    //changed in the code 
    

    @Override
    public void check() {
        System.out.println("bank()");
    }

    @Override
    public void pay() {
        System.out.println("pay()");
    }

    @Override
    public void statement() {
        System.out.println("statement()");
    }
}

public class Passbbook {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.check();
        d.pay();
        d.statement();
    }
}