import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // Input jumlah peserta
        int jumlahPeserta = input.nextInt();
        input.nextLine();

        // Array untuk menampung data
        String[] namaPeserta = new String[jumlahPeserta];

        // For loop
        for (int i = 0; i < jumlahPeserta; i++) {
            // Input untuk menyimpan ke dalam array di i
            namaPeserta[i] = input.nextLine();
        }

        // For loop
        for (int i = 0; i < jumlahPeserta; i++) {
            System.out.println("Bulan " + (i + 1) + ": " + namaPeserta[i]);
        }

        // Menutup Scanner
        input.close();
    }
}
