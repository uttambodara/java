import java.util.Scanner;

public class p12 {
       public static void main(String[] args) {
            int[][] matrix = new int[3][3];
            Scanner scanner = new Scanner(System.in);

            // Input and store elements in the matrix
            System.out.println("Enter the elements of the matrix (3x3):");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            // Calculate the sum of the left diagonal elements
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += matrix[i][i];
            }

            // Display the sum of the left diagonal elements
            System.out.println("Sum of the left diagonal elements = " + sum);
        }
    }

