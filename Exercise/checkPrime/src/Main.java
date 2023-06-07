import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = scanner.nextInt();
        boolean check = isPrime(number);
        System.out.println(check ? "is a prime" : "not a prime");
    }

    public static boolean isPrime(int number) {
        boolean check = true;
        if (number < 2) {
            check = false;
        } else if (number == 2) {
            check = true;
            return check;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    return check;
                }
            }
        }
        return check;
    }
}