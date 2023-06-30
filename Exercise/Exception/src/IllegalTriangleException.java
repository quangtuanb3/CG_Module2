import java.util.Scanner;

public class IllegalTriangleException extends Throwable {
    static Scanner sc = new Scanner(System.in);

    public static int getSide(int i) {
        System.out.printf("Input side %d \n", i);
        return sc.nextInt();
    }

    public String getMessage() {
        return "Illegal Triangle side";
    }

    IllegalTriangleException() {
    }

    public static void main(String[] args) {
        try {
            int s1 = getSide(1);
            int s2 = getSide(2);
            int s3 = getSide(3);
            Triangle t1 = new Triangle(s1, s2, s3);
            System.out.println("side: " + t1.side1 + " " + t1.side2 + " " + t1.side3);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }

    }
}
