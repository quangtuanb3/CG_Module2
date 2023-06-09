import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] marks = initArray();
        int count = 0;
        for (int mark : marks) {
            if (mark >= 5) {
                count++;
            }
        }
        System.out.println(Arrays.toString(marks));
        System.out.printf("Number of Students pass: %d", count);
    }

    static int[] initArray() {
        int length = 0;
        do {
            System.out.println("Input number of students: ");
            length = scanner.nextInt();
            if (length > 30) {
                System.out.println("Students should not exceed 30. Input again: ");
            }
        } while (length > 30);
        int[] marks = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.printf("Input mark of student %d: ", i + 1);
            do {
                marks[i] = scanner.nextInt();
                if (marks[i] < 0 || marks[i] > 10) {
                    System.out.println("Mark must be from 0 to 10. Input again: ");
                }
            } while (marks[i] < 0 || marks[i] > 10);
        }
        return marks;
    }
}