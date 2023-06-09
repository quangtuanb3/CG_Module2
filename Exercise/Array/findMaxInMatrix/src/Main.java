import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matrix = initMatrix();
        int[] max = findMaxInMatrix(matrix);
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.toString(max));


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

    static int[] findMaxInMatrix(int[][] matrix) {
        int[] max = {Integer.MIN_VALUE, -1, -1};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max[0] < matrix[i][j]) {
                    max[0] = matrix[i][j];
                    max[1] = i;
                    max[2] = j;
                }
            }
        }
        return max;
    }

}