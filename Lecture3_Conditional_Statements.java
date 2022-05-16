import java.util.*;

public class Lecture3_Conditional_Statements {
    public static void main(String[] args) {

        /* Conditional statements */

        // IF-ELSE
        System.out.println("----- Eligible or Not -----");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
        System.out.println("You can vote");
        } else {
        System.out.println("Sorry, you can't vote'");
        }




        System.out.println("\n----- Check Even Or Odd ----");
        System.out.println("Enter Number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
        System.out.println("Even Number");
        } else {
        System.out.println("Odd Number");
        }



        System.out.println("\n----- Check Equal , Greater or Lesser ----");
        System.out.println("Enter number1: ");
        int a = sc.nextInt();
        System.out.println("Enter number2: ");
        int b = sc.nextInt();

        if (a == b) {
        System.out.println("Equal");
        } else if (a < b) {
        System.out.println(" number1 < number2");
        } else {
        System.out.println(" number2 < number1");
        }
        
        

        // Switch
        System.out.println("------- Switch Case ------ ");

        System.out.println("Enter Your Case Number : ");
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("Number 1");
                break;

            case 2:
                System.out.println("Number 2");
                break;

            case 3:
                System.out.println("Number 3");
                break;

            default: System.out.println("Envalid");
                break;
        }
    }

}
