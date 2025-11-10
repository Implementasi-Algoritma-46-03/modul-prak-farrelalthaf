import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // Input sebuah bilangan bulat N yang di mana 1 <= N <= 100
        int n = input.nextInt();

        // For loop
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " Genap");
            } else {
                System.out.println(i + " Ganjil");
            }
        }

        // Menutup Scanner
        input.close();
    }
}
