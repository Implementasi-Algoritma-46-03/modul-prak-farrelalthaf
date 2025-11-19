import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // Input nilai N
        int n = input.nextInt();
        
        // Inisialisasi variabel awal
        int jumlahAmoeba = 30; // Jumlah amoeba di awal
        int waktu = 0; // Waktu yang berlalu di awal

        // While
        while (jumlahAmoeba < n) {
            waktu += 15;
            jumlahAmoeba *= 2;
        }

        // Cetak hasil
        System.out.println(waktu);
    }
}
