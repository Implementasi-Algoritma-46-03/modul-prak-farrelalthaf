import java.util.Scanner;
import java.util.Locale;

public class TP01 {

    // Method untuk mengubah Fahrenheit ke Celcius
    public static double fahrenheitToCelcius(double f) {
        return (5.0 / 9.0) * (f - 32);
    }

    // Method untuk mengubah Fahrenheit ke Reamur
    public static double fahrenheitToReamur(double f) {
        return (4.0 / 9.0) * (f - 32);
    }

    public static void main(final String[] args) {
        Locale.setDefault(Locale.US); // Untuk fix masalah locale
        Scanner input = new Scanner(System.in);

        // Input tiga buah bilangan riil (Fahrenheit)
        double f1 = input.nextDouble();
        double f2 = input.nextDouble();
        double f3 = input.nextDouble();

        // Konversi ke Celcius menggunakan method
        double c1 = fahrenheitToCelcius(f1);
        double c2 = fahrenheitToCelcius(f2);
        double c3 = fahrenheitToCelcius(f3);

        // Konversi ke Reamur menggunakan method
        double r1 = fahrenheitToReamur(f1);
        double r2 = fahrenheitToReamur(f2);
        double r3 = fahrenheitToReamur(f3);

        // Output hasil dari konversi dengan dua angka dibelakang koma
        System.out.printf("Celcius: %.1f %.1f %.1f%n", c1, c2, c3);
        System.out.printf("Reamur: %.2f %.2f %.2f%n", r1, r2, r3);

        input.close();
    }
}
