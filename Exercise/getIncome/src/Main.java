import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Số_tiền_lãi = Số_tiền_gửi *  tỉ_lệ_lãi_suất (% năm) / 12 * số_tháng_gửi
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input principal (USD): ");
        float principal = scanner.nextInt();

        System.out.println("Input rate per year (%): ");
        float rate = scanner.nextFloat();

        System.out.println("Input rate months: ");
        int months = scanner.nextInt();

        float income = principal * rate / 12 / 100 * months;

        System.out.println(income + " USD");
    }
}