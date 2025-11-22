import java.util.Scanner;
import java.util.Arrays;

public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // Input jumlah peserta
        int jumlahPeserta = input.nextInt();

        // Array untuk menampung data
        int[] poinPeserta = new int[jumlahPeserta];

        // For loop
        for (int i = 0; i < jumlahPeserta; i++) {
            poinPeserta[i] = input.nextInt();
        }

        // Proses sorting untuk mengurutkan angka dari kecil ke besar
        Arrays.sort(poinPeserta);
        
        // For loop terbalik untuk mengurutkan angka dari besar ke kecil
        for (int i = jumlahPeserta - 1; i >= 0; i--) {
            System.out.print(poinPeserta[i] + " ");
        }

        // Menutup Scanner
        input.close();
    }
}
