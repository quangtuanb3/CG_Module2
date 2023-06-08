import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = initArray();
        int min = findMin(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.printf("Min: %d", min);
    }

    static int[] initArray() {
        int length = 0;
        do {
            System.out.println("Input array length: ");
            length = scanner.nextInt();
            if (length < 2) {
                System.out.println("array length must be greater than 2. Input again: ");
            }
        } while (length < 2);
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.printf("Input number %d: ", i + 1);
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    static int findMin(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}