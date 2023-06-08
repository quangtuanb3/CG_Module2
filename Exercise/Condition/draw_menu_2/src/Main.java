import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        printMainMenu();
        int choice = 0;
        choice = sc.nextInt();
        printSelectMenu(choice);

    }

    static void printMainMenu() {
        System.out.println("Menu");
        System.out.println("1. Draw rectangle");
        System.out.println("2. Draw square triangle");
        System.out.println("3. Draw isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
    }


    static void printSelectMenu(int choice) {
        switch (choice) {
            case 1:
                int length = 0;
                int height = 0;
                System.out.println("1. Draw rectangle: ");
                do {
                    System.out.println("Input length: ");
                    length = sc.nextInt();
                    System.out.println("Input height: ");
                    height = sc.nextInt();
                } while (length <= 0 || height <= 0);
                drawRectangle(length, height);
                printMainMenu();
                break;
            case 2:
                choice = 0;
                printTriangleMenu();
                choice = sc.nextInt();
                triangleMenuSelection(choice);
                break;
            case 3:
                choice = 0;
                System.out.println("Input side:");
                choice = sc.nextInt();
                drawIsoscelesTriangle(choice);
                printMainMenu();
                break;
            case 0:
                printMainMenu();
                break;
        }
    }

    static void drawRectangle(int length, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    static void printTriangleMenu() {
        System.out.println("Draw square triangle:");
        System.out.println("1. Draw square triangle (square at top-left)");
        System.out.println("2. Draw square triangle (square at top-right)");
        System.out.println("3. Draw square triangle (square at bottom-left)");
        System.out.println("4. Draw square triangle (square at bottom-right)");
        System.out.println("0. Back to main menu");
        System.out.println("Enter your choice: ");
    }

    static void triangleMenuSelection(int choice) {
        int side = 0;
        switch (choice) {
            case 1:
                System.out.println("1. Draw square triangle (square at top-left): ");
                do {
                    System.out.println("Input side A: ");
                    side = sc.nextInt();

                } while (side <= 0);
                drawTriangle(side, "top-left");
                break;
            case 2:
                System.out.println("2. Draw square triangle (square at top-right): ");
                do {
                    System.out.println("Input side A: ");
                    side = sc.nextInt();

                } while (side <= 0);
                drawTriangle(side, "top-right");
                break;
            case 3:
                System.out.println("3. Draw square triangle (square at bottom-left): ");
                do {
                    System.out.println("Input side A: ");
                    side = sc.nextInt();
                } while (side <= 0);
                drawTriangle(side, "bottom-left");
                break;
            case 4:
                System.out.println("3. Draw square triangle (square at bottom-right): ");
                do {
                    System.out.println("Input side A: ");
                    side = sc.nextInt();

                } while (side <= 0);
                drawTriangle(side, "bottom-right");
                break;
            case 0:
                printMainMenu();
                break;
        }
    }

    static void drawIsoscelesTriangle(int side) {
        for (int i = 0; i < side; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < side - i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    static void drawTriangle(int side, String conner) {
        switch (conner) {
            case "top-left":
                for (int i = 1; i < side; i++) {
                    for (int j = 0; j < side - i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                break;
            case "top-right":
                for (int i = 1; i < side; i++) {
                    for (int k = 1; k < i; k++) {
                        System.out.print("  ");
                    }
                    for (int j = 1; j < side - i; j++) {
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                break;
            case "bottom-left":
                for (int i = 1; i <= side; i++) {
                    for (int j = side - i; j > 0; j--) {
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                break;
            case "bottom-right":
                for (int i = 1; i <= side; i++) {
                    for (int j = side - i; j > 0; j--) {
                        System.out.print("  ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                break;
        }
    }

}