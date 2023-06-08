import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int prime = 2;
        while (prime < 100) {
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