import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double payment = scanner.nextDouble();

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);

        Locale india = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(india);

        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + indiaFormat.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));

        scanner.close();
    }
}
