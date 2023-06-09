import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matrix = initSquareMatrix();
        System.out.println("Input diagonal you want to get total: ");
        System.out.println("1. Form left to right");
        System.out.println("2. From right to left");
        System.out.println("0. Exit");
        int choice = scanner.nextInt();
        int total = getTotalOfDiagonal(matrix, choice);
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(total);


    }

    static int[][] initSquareMatrix() {
        System.out.println("Init Square Matrix");
        System.out.println("Input size: ");
        int size = 0;
        do {
            size = scanner.nextInt();
            if (size < 2) {
                System.out.println("Please input length is greater than 1");
            }
        } while (size < 2);

        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Input row %d\n", i + 1);
            for (int j = 0; j < size; j++) {
                System.out.printf("Input number %d\n", j + 1);
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    static int getTotalOfDiagonal(int[][] matrix, int choice) {
        int total = 0;
        switch (choice) {
            case 1:
                for (int i = 0; i < matrix.length; i++) {
                    total += matrix[i][i];
                }
                break;
            case 2:
                for (int i = matrix.length - 1; i >= 0; i--) {
                    total += matrix[i][i];
                }
                break;
            case 3:
                System.exit(0);
        }
        return total;
    }
}