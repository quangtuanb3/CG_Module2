import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập y: ");
        int y = scanner.nextInt();
        Calculator calculator = new Calculator(x, y);
        calculator.cal();
    }

    public static class Calculator {
        int x;
        int y;

        Calculator(int x, int y) {
            this.x = x;
            this.y = y;
        }

        void cal() {
            try {
                int a = x + y;
                int b = x - y;
                int c = x * y;
                int d = x / y;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

    }
}
