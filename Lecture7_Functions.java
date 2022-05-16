import java.util.*;

public class Lecture7_Functions {
        // 1. Print a given name in a function
    public static void PrintName(String name){
        System.out.println("You entered " + name);
        return;
    }

    // 2. add two number function 
    public static int AddTwoNumber(int a, int b){
        int sum = a + b;
        return sum;
        }

    
        // 3. Make a function to multiply two numbers
        public static int MultiplyTwoNumber(int a, int b){
            return a * b;
        }

        // 4. find factorial of number
        public static void FindFactorial(int n){
            int factorial = 1;

            for(int i = n ; i>= 1 ; i--){
                factorial = factorial * i;
            }
            System.out.println(factorial);
            return ;
        }
    public static void main(String[] args) {
        
        // 1. Print a given name in a function
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = sc.nextLine();

        // calling the function
        PrintName(name);



        // 2. Make a function to add 2 number and return sum
        System.out.println("Enter number 1: ");
        int a = sc.nextInt();
        System.out.println("Enter number 2: ");
        int b = sc.nextInt();

        // calling the add function
        int sum = AddTwoNumber(a,b);
        System.out.println("The addition of two number is: " + sum);


        // 3. Make a function to multiply two numbers
        System.out.println("The multiplication of two numbers is: "+ MultiplyTwoNumber(a,b));



        // 4. Find Factorial of number
        System.out.println("Enter number for factorial : ");
        int n = sc.nextInt();
        FindFactorial(n);
    }
    
}
