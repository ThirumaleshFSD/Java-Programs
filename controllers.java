class facebook{
    String name;
    int age;
    String email;
    public int post(int a,int b){
        
        int sum = a + b;
        System.out.println("Sum: " + sum);
        System.out.println("This is a post.");
        return sum;
        
        
    }

    
}
class Sam{
    public Sam(){
 System.out.println("This is a constructor.");
    }
}
public class controllers {
    public static void main(String[] args) {
        facebook user = new facebook();
        user.name = "Thiru";
        user.age = 25;
        user.email = "thiru@gmail.com";
        System.out.println("Name: " + user.name);
        System.out.println("Age: " + user.age); 
        System.out.println("Email: " + user.email);
        user.post(10,20);

        facebook user2 = new facebook();
        user2.name = "Sundar";
        System.err.println("Name: " + user2.name);
        Sam obj = new Sam();
        

    }
}
