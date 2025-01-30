import java.util.Scanner;

public class Matrixtranspose {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the dimensions of the matrix
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        
        // Initialize the matrix
        int[][] matrix = new int[rows][cols];
        
        // Input elements into the matrix
        System.out.println("Enter elements for the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Initialize the transpose matrix
        int[][] transpose = new int[cols][rows];
        
        // Transpose the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];  // Assign matrix[i][j] to transpose[j][i]
            }
        }
        
        // Display the original matrix
        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix);
        
        // Display the transposed matrix
        System.out.println("\nTransposed Matrix:");
        printMatrix(transpose);
        
        // Close the scanner
        scanner.close();
    }
    
    // Method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

