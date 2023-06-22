import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str = "Able was I ere I saw Elba";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        String reserveStr = reserveStr(str);
        if (reserveStr.equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    public static String reserveStr(String str) {
        String[] arr = str.split("");
        StringBuilder result = new StringBuilder();
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(arr[i]);
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
}