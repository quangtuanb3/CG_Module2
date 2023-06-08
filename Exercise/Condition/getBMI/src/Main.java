import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        bmi = weight / height2
        Scanner scanner = new Scanner(System.in);
        double bmi, weight, height;
        String interpretation;
        System.out.println("Input weight: ");
        weight = scanner.nextDouble();
        System.out.println("Input height: ");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.println(bmi);
        if (bmi < 18.5) {
            interpretation = "Underweight";
        } else if (bmi < 25) {
            interpretation = "Normal";
        } else if (bmi < 30) {
            interpretation = "Overweight";
        } else {
            interpretation = "Obese";
        }
        System.out.printf("  %s             %s%n", "BMI", "Interpretation");
        System.out.printf("%f            %s%n", bmi, interpretation);

    }
}