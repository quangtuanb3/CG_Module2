import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name: ");
        String nameToFind = scanner.nextLine();
        boolean isExist = names.stream().anyMatch(name -> name.equals(nameToFind));
        System.out.println(isExist);

    }
}