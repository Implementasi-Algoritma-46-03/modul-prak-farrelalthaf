import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // Input bilangan bulat N di mana 1 <= N <= 100
        int n = input.nextInt();

        // Inisialisasi variabel pelacak angka
        int bilanganSaatIni = 0;
        
        // For loop untuk membuat baris
        for (int i = 1; i <= n; i++) {
            // Nested For untuk membuat kolom dan membuat isi kolom seperti di output soal
            for (int j = 1; j <= n - (i - 1); j++) {
                System.out.print(bilanganSaatIni);
                bilanganSaatIni = (bilanganSaatIni + 1) % 10;
            }

            // Menampilkan hasil
            System.out.println();
        }

        // Menutup Scanner
        input.close();
    }
}
