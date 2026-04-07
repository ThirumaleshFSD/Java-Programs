class pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing something");
    }
}
public class PRB1 {
    public static void main(String[] args) {
        pen myPen = new pen();
        myPen.color = "blue";
        myPen.type = "ballpoint";
        myPen.write();
        pen myPen2 = new pen();
        myPen2.color = "black"; 
        myPen2.type = "gel";
        myPen2.write();
System.out.println("My pen color is " + myPen.color + " and type is " + myPen.type);
System.out.println("My pen2 color is " + myPen2.color + " and type is " + myPen2.type);
    }
}
