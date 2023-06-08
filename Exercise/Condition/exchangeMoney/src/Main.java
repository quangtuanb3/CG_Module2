import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float vnd, rate = 23000.0f;
        System.out.println("Enter money (USD): ");
        float usd = scanner.nextFloat();
        vnd = usd * rate;
        System.out.println(usd + " = " + vnd);
    }
}