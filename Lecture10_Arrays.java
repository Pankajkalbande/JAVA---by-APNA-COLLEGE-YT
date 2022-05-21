import java.util.*;

public class Lecture10_Arrays {
    public static void main(String[] args) {

        // int[] marks = new int[5];
        // marks[0] = 10;
        // marks[1] = 20;
        // marks[2] = 30;
        // marks[3] = 40;
        // marks[4] = 50;

        // System.out.println(marks[3]);
        // System.out.println("\n");
        // // using for loop
        // for (int i = 0; i < 5; i++) {
        //     System.out.println(marks[i]);
        // }

        // System.out.println("\n");

        // int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // // System.out.println(numbers[0]);

        // for(int i = 0; i < numbers.length; i++) {
        //     System.out.println(numbers[i]);
        // }
        // System.out.println("\n");


        System.out.println("FROM USER INPUT ARRAY");
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of array you want: ");
        int size = sc.nextInt();

        int StudentId[] = new int [size];
        System.out.println("\n Enter Student Id: ");
        // input 
        for(int i = 0 ; i < size; i++) {
            StudentId[i] = sc.nextInt();
        }
            System.out.println("\n Display Student Id: ");
        // output
        for(int i = 0 ; i < size; i++) {
            System.out.println(StudentId[i]);
        }
    }

}
