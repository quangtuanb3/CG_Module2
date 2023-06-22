import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int num = 100;
        String result = toBinary(num);
        System.out.println(result);

    }

    public static String toBinary(int num) {
        Stack<String> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        while (num != 0) {
            stack.push(String.valueOf(num % 2));
            num /= 2;
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
}