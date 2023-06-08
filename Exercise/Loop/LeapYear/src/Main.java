import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input year: ");
        int year = scanner.nextInt();

        if(year % 4 ==0 && year % 100 != 0){
            System.out.println(year + " is a leap year");
        } else if (year % 100 == 0 && year % 400 !=0) {
            System.out.println(year + " isn't a leap year");
        } else if (year % 100 == 0 && year % 400 ==0) {
            System.out.println(year + " is a leap year");
        } else if(year < 0){
            System.out.println("Invalid input");
        } else {
            System.out.println(year + " isn't a leap year");
        }
    }
}