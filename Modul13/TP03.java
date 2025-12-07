import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // Input jumlah mahasiswa
        int jumlahMahasiswa = input.nextInt();

        // Buat Array
        int[] array = new int[jumlahMahasiswa];

        // Membaca input untuk array
        for (int i = 0; i < jumlahMahasiswa; i++) {
            array[i] = input.nextInt();
        }

        // Input key yang dicari
        int key = input.nextInt();

        // Variabel untuk menyimpan indeks yang ditemukan
        boolean found = false;

        // Linear search
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (array[i] == key) {
                found = true;
                System.out.print("Ditemukan di indeks ke-" + i); // Cetak indeks
            }
        }

        // Jika nilai tidak ditemukan
        if (!found) {
            System.out.println("Tidak ditemukan");
        }
    }
}
