interface PM{
    default void m1(){
        System.out.println("Default method");
    }
}
    interface CM{
        default void m2(){
            System.out.println("Nested interface");
        }
    }
    class Thiru{
 void m3(){
    System.out.println("m3()");
 }
    }

class AP extends Thiru implements PM,CM{
    // @Override
    public void m1(){
        System.out.println("m1()");
    }
    public void m2(){
        System.out.println("m2()");
    }
    public void m3(){
        System.out.println("m3()");
    }
}
public class inter {
    public static void main(String[] args) {
        AP a = new AP();
        a.m1();
        a.m2();
        a.m3();
    }
    
}
