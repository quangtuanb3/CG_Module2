import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number a: ");
        int a = scanner.nextInt();

        System.out.println("Input number b: ");
        int b = scanner.nextInt();

        int greatestDiv = getGreatestDivisor(a, b);

        System.out.println(greatestDiv == 0? "There is no common divisor": "The greatest common divisor is: " + greatestDiv);
    }

    public static int getGreatestDivisor(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        int greatestDiv = 0;
        int c = Math.max(a, b);
        if (a == 0 && b == 0) {
            return greatestDiv;
        } else {
            for (int i = c; i >= 1; i--) {
                if (a % i == 0 && b % i == 0) {
                    greatestDiv = i;
                    return greatestDiv;
                }
            }
        }
        return greatestDiv;
    }

}