import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 6, 72, 1};
        int[] result = reverseIntegerArray(numbers);
        System.out.println(Arrays.toString(result));
    }

    public static int[] reverseIntegerArray(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        for (int num : numbers) {
            stack.push(num);
        }
        System.out.println(stack);
        int[] result = new int[numbers.length];
        int i = 0;
        while (!stack.isEmpty()) {
            result[i] = stack.pop();
            i++;
        }

        return result;
    }
}