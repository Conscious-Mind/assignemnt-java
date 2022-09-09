import java.util.Arrays;
import java.util.Scanner;

public class Problem04MatrixMult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Getting Matrix A
        System.out.println("Matrix 1: ");
        System.out.print("Enter how many rows in Matrix A: ");
        int row1 = scan.nextInt();
        System.out.print("Enter how many columns in Matrix A: ");
        int column1 = scan.nextInt();
        int matrixA[][] = new int[row1][column1];
        System.out.println("Enter the elements of the Matrix A:");
        for (int i = 0; i < row1; i++)
            for (int j = 0; j < column1; j++)
                matrixA[i][j] = scan.nextInt();

        System.out.println("Matrix A is: ");
        System.out.println(Arrays.deepToString(matrixA));
        System.out.println();

        // Getting Matrix B
        System.out.println("Matrix B: ");
        System.out.print("Enter how many rows in Matrix B: ");
        int row2 = scan.nextInt();
        System.out.print("Enter how many columns in Matrix B: ");
        int column2 = scan.nextInt();
        int matrixB[][] = new int[row2][column2];
        System.out.println("Enter the elements of the Matrix B:");
        for (int i = 0; i < row2; i++)
            for (int j = 0; j < column2; j++)
                matrixB[i][j] = scan.nextInt();

        System.out.println("Matrix B is: ");
        System.out.println(Arrays.deepToString(matrixB));
        System.out.println();

        // Multipliying matrix a and b

        multiplyMatrix(row1, column1, matrixA, row2, column2, matrixB);

        scan.close();

    }

    public static void multiplyMatrix(
            int row1, int col1, int A[][],
            int row2, int col2, int B[][]) {
        int i, j, k;

        if (row2 != col1) {
            System.out.println("Matrix Multiplication is not Possible");
            return;
        }

        int[][] matrixC = new int[row1][col2];

        // Multiply the two matrices
        for (i = 0; i < row1; i++) {
            for (j = 0; j < col2; j++) {
                for (k = 0; k < row2; k++)
                    matrixC[i][j] += A[i][k] * B[k][j];
            }
        }

        System.out.println("The matrix multiplication is: ");
        System.out.println(Arrays.deepToString(matrixC));
    }
}
