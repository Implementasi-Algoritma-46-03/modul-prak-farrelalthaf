import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // Input sebuah bilangan bulat N, 1 <= N <= 10
        int bilanganBulat = input.nextInt();

        // For loop untuk membuat baris
        for (int i = 1; i <= bilanganBulat; i++) {
            // For loop untuk membuat kolom dan melakukan perkalian
            for (int j = 1; j <= bilanganBulat; j++) {
                int hasilPerkalian = j * i;
                System.out.printf(hasilPerkalian + " ");
            }

            // Menampilkan hasil
            System.out.println();
        }

        // Menutup Scanner
        input.close();
    }
}
