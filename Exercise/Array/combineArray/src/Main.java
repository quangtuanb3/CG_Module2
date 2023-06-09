import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input Array 1:");
        int[] numbers1 = initArray();
        System.out.println("Input Array 2:");
        int[] numbers2 = initArray();
        int[] numbers3 = new int[numbers1.length + numbers2.length];
        for (int i = 0; i < numbers1.length; i++) {
            numbers3[i] = numbers1[i];
        }
        for (int i = 0, j = numbers1.length; i < numbers2.length; i++, j++) {
            numbers3[j] = numbers2[i];
        }
        System.out.println(Arrays.toString(numbers3));
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
}