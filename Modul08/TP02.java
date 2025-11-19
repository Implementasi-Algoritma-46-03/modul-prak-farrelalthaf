import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // Input bilangan bulat N
        int n = input.nextInt();

        // Inisialisasi variabel untuk menyimpan angka terbalik
        int angkaTerbalik = 0;

        // Do-while
        do {
            int digit = n % 10; // Ambil digit terakhir dari n
            angkaTerbalik = (angkaTerbalik * 10) + digit; // Geser angkaTerbalik ke kiri 1 digit, lalu tambahkan digit baru
            n = n / 10; // Hapus digit terakhir dari n
        } while (n != 0); // Ulangi proses ini selama n belum menjadi 0

        // Cetak hasil
        System.out.println(angkaTerbalik);
    }
}
