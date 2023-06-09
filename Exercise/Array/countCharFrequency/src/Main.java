import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input a string: ");
        String string = scanner.nextLine();
        System.out.println("Input character you want to count: ");
        String character;

        do {
            character = scanner.nextLine();
            if (character.length() != 1) {
                System.out.println("Please input one character: ");
            }
        } while (character.length() != 1);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.toString(string.charAt(i)).equals(character)) {
                count++;
            }
        }
        System.out.println(string);
        System.out.println(character);
        System.out.println(count);
    }
}