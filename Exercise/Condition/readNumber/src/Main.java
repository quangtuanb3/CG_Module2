import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = scanner.nextInt();
        String numberString = "";
        if (number < 10) {
            numberString = units(number);
        } else if (number < 20) {
            number = number - 10;
            numberString = under20(number);
        } else if (number < 100) {
            int tens = number / 10;
            int units = number % 10;
            String tensString = tens(tens);
            String unitString = "";
            if (units != 0) {
                unitString = units(units);
            }
            numberString = tensString + " " + unitString;
        } else if (number < 1000) {
            int hundreds = number / 100;
            int tens = number % 100;
            numberString += units(hundreds) + " hundred ";
            if (tens < 10) {
                if (tens != 0) {
                    numberString += units(tens);
                }
            } else if (tens < 20) {
                tens = tens - 10;
                numberString += under20(tens);
            } else {
                int tensTemp = tens / 10;
                int units = tens % 10;
                String tensString = tens(tensTemp);
                String unitString = "";
                if (units != 0) {
                    unitString = units(units);
                }
                numberString += tensString + " " + unitString;
            }
        }
        System.out.println(numberString);
    }

    public static String units(int number) {
        String numberString = "";
        switch (number) {
            case 0:
                numberString = "zero";
                break;
            case 1:
                numberString = "one";
                break;
            case 2:
                numberString = "two";
                break;
            case 3:
                numberString = "three";
                break;
            case 4:
                numberString = "four";
                break;
            case 5:
                numberString = "five";
                break;
            case 6:
                numberString = "six";
                break;
            case 7:
                numberString = "seven";
                break;
            case 8:
                numberString = "eight";
                break;
            case 9:
                numberString = "nine";
                break;
        }
        return numberString;
    }

    public static String under20(int number) {
        String numberString = "";
        switch (number) {
            case 0:
                numberString = "ten";
                break;
            case 1:
                numberString = "eleven";
                break;
            case 2:
                numberString = "twelve";
                break;
            case 3:
                numberString = "thirteen";
                break;
            case 4:
                numberString = "fourteen";
                break;
            case 5:
                numberString = "fifteen";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                numberString = units(number) + "teen";
        }
        return numberString;
    }

    public static String tens(int number) {
        String numberString = "";
        switch (number) {
            case 2:
                numberString = "twenty";
                break;
            case 3:
                numberString = "thirty";
                break;
            case 4:
                numberString = "forty";
                break;
            case 5:
                numberString = "fifty";
                break;
            case 6:
            case 7:
            case 9:
                numberString = units(number) + "ty";
                break;
            case 8:
                numberString = units(number) + "y";
                break;
        }
        return numberString;
    }
}
