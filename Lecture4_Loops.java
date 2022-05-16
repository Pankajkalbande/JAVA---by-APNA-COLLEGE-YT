import java.util.*;


public class Lecture4_Loops {
    public static void main(String[] args) {
        
        // For Loop
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + " Hello World");
        }

        System.out.println("-----------FOR loop------------");
        for (int i = 1; i <= 10; i++) {
            // System.out.println(i);
            System.out.println(i+" ");
        }


        System.out.println("---------WHILE Loop--------------");
        int i = 0;
        while (i < 11) {
            System.out.println(i);
            i++;
        }


        System.out.println("----------DO WHILE-------------");
        int j = 1; 
        do{
            System.out.println(j);
            j++;
        }while (j < 11);


        System.out.println("----------Print the sum of first n Natural number-------------");
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int k = 0; k <= n; k++) {
            sum = sum + k;
        }
        System.out.println("Sum is : " + sum);




        System.out.println("----------Print the table of number-------------");
        int num = sc.nextInt();
        System.out.println("\n");
        for (int x = 1; x < 11; x++) {
            System.out.println(num*x);
        }

    }
    
}
