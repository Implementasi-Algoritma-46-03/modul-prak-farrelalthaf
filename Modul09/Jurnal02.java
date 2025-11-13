import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // Input sebuah bilangan bulat N yang di mana 1 <= N <= 1000
        int n = input.nextInt();

        // Inisiasi variabel hasil
        int total = 0;

        // For loop
        for (int i = 1; i <= n; i+=2) {
            total += i;
        }

        // Menampilkan hasil
        System.out.println(total);

        // Menutup Scanner
        input.close();
    }
}
