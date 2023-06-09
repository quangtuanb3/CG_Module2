import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matrix = initMatrix();
        System.out.println("Enter column you want to get total: ");
        int column = -1;
        do {
            column = scanner.nextInt();
            if (column < 0 || column > matrix[0].length - 1) {
                System.out.println("Invalid column. Input again: ");
            }
        } while (column < 0 || column > matrix[0].length - 1);
        int total = getTotalOfColumn(column, matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    static int[][] initMatrix() {
        System.out.println("Init Matrix");
        System.out.println("Input length: ");
        int length = 0;
        do {
            length = scanner.nextInt();
            if (length < 2) {
                System.out.println("Please input length is greater than 1");
            }
        } while (length < 2);
        System.out.println("Input height: ");
        int height = 0;
        do {
            height = scanner.nextInt();
            if (height < 2) {
                System.out.println("Please input height is greater than 1");
            }
        } while (height < 2);
        int[][] matrix = new int[height][length];
        for (int i = 0; i < height; i++) {
            System.out.printf("Input row %d\n", i + 1);
            for (int j = 0; j < length; j++) {
                System.out.printf("Input number %d\n", j + 1);
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    static int getTotalOfColumn(int column, int[][] matrix) {
        int total = 0;
        for (int[] ints : matrix) {
            total += ints[column];
        }
        return total;
    }
}