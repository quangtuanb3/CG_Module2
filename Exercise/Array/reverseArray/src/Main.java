import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7, 3, 2, 1, 0, 9};
        int[] newNumbers = reverseArray(numbers);
        System.out.println(Arrays.toString(newNumbers));
    }

    static int[] reverseArray(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
        return numbers;
    }
}