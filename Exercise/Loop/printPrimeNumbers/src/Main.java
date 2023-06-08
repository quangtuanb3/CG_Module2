import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter quantity of number to print: ");
        int quantity = scanner.nextInt();
        int prime = 2;
        while (numbers.size() <= quantity) {
            if (isPrime(prime))
                numbers.add(prime);
            prime++;
        }
        System.out.println(numbers);
    }

    static boolean isPrime(int number) {
        boolean check = true;
        if (number < 2) {
            check = false;
        } else if (number == 2) {
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