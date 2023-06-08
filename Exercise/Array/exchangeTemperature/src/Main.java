import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printMenu();
        int choice = scanner.nextInt();
        doChoice(choice);
    }

    static void printMenu() {
        System.out.println("Menu");
        System.out.println("1. C to F");
        System.out.println("2. F to C");
        System.out.println("0. Exit");
    }

    static void doChoice(int choice) {
        double temp;
        double result;
        switch (choice) {
            case 1:
                System.out.println("1. C to F");
                System.out.println("Input temperature (C): ");
                temp = scanner.nextDouble();
                result = exchangeTemperature("C", temp);
                System.out.println(result);
                break;
            case 2:
                System.out.println("2. F to C");
                System.out.println("Input temperature (F): ");
                temp = scanner.nextDouble();
                result = exchangeTemperature("F", temp);
                System.out.println(result);
                break;
            case 0:
                System.exit(0);
        }
    }

    static double exchangeTemperature(String inputType, double temp) {
//        celsius = (5.0 / 9) * (fahrenheit - 32)
        double result = 0;
        switch (inputType) {
            case "F":
                result = (5.0 / 9) * (temp - 32);
                break;
            case "C":
                result = temp / 5 * 9 + 32;
        }
        return result;
    }
}