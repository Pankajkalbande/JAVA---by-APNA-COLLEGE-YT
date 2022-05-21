import java.util.*;

public class Lecture11_2Darray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:  ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        System.out.println("\n Enter elements");
        // input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n");

        // output
        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < cols; j++) {
        // System.out.println(numbers[i][j] + "");
        // }
        // System.out.println();
        // }

        // find element
        System.out.println("Enter element which you want to find ? ");
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("Element found at location {" + i + "," + j + "}");
                }
            }
        }

    }

}
