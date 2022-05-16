import java.util.Scanner;

public class Lecture2_Variable {
    public static void main(String[] args) {
        
        // output
        System.out.println("Hello World with Java");
        System.out.print("from");
        System.out.print("\napni Kaksha");

        System.out.println("\n");
        System.out.println("*\n**");

        System.out.println("---------");

        // variable
        int a = 25;
        int b = 100;
        String name = "Pankaj";

        double price = 24.016662;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);
        System.out.println(price);

        System.out.println("sum :" + (a+b));
        System.out.println("mul :" + (a*b));

        /*
         PRIMITIVE DATA TYPES    NON-PRIMITIVE
        byte                        String
        short                       Array
        char                        class
        boolean                     Object
        int                         Interface
        long
        float
        double
        */


        // User Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String Name = sc.nextLine();
        System.out.println("Enter age: ");
        int age = sc.nextInt();

        System.out.println("Your name is " + Name +" and your age is " + age);
    }
    
}
