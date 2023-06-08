import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = initArray();
        System.out.println("Input number to delete: ");
        int number = scanner.nextInt();
        int index = getIndex(numbers, number);
        if (index == -1) {
            System.out.println("number is not in numbers array");
            return;
        }
        for (int j = index; j < numbers.length - 1; j++) {
            numbers[j] = numbers[j + 1];
        }
        numbers[numbers.length - 1] = 0;

        System.out.println(Arrays.toString(numbers));
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

    static int getIndex(int[] numbers, int number) {
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                index = i;
            }
        }
        return index;
    }

}