import java.util.Scanner;

public class H_MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] firstMatrix = new int[3][3];
        int[][] secondMatrix = new int[3][3];

        // Reading elements of the first matrix
        System.out.println("Enter elements of the first 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                firstMatrix[i][j] = scanner.nextInt();
            }
        }

        // Reading elements of the second matrix
        System.out.println("Enter elements of the second 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                secondMatrix[i][j] = scanner.nextInt();
            }
        }

        // Multiplying the matrices
        int[][] resultMatrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        // Printing the result matrix
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
