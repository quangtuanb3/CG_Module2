import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = initArray();
        int index = inputIndex();
        int number = inputNumber();
        if (index <= -1 || index >= numbers.length - 1) {
            System.out.println("Unable add new element!");
            return;
        }
        for (int i = numbers.length - 1; i > index; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[index] = number;
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

    static int inputIndex() {
        System.out.println("Input index of element: ");
        return scanner.nextInt();
    }

    static int inputNumber() {
        System.out.println("Input number: ");
        return scanner.nextInt();
    }
}