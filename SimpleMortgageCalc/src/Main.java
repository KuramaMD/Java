import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principal;
        while(true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
                System.out.println("Enter a number between 1000 and 1M");
        }

        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / MONTHS_IN_YEAR / PERCENT;
        System.out.print("Period (Years): ");
        int period = scanner.nextInt();
        int periodInMonths = period * MONTHS_IN_YEAR;
        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, periodInMonths) / (Math.pow(1 + monthlyInterest, periodInMonths) - 1));
        String mortgageFormatted = NumberFormat.getCurrencyInstance(Locale.US).format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }

}
