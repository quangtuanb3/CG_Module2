import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str = "(3+3*2+(2-4)+ 3/(2+1))";
        boolean result = checkBarack(str);
        System.out.println(result);

    }

    public static boolean checkBarack(String str) {
        Stack<String> bStack = new Stack<>();
        String sym;
        String[] arr = str.split("");
        for (String s : arr) {
            if (s.equals("(")) {
                bStack.push(s);
            } else if (s.equals(")")) {
                if (bStack.isEmpty()) {
                    return false;
                }
                String left = bStack.pop();
                if (left.equals(s)) {
                    return false;
                }
            }

        }
        if (bStack.isEmpty()) {
            return true;
        }
        return true;
    }
}