import java.util.Scanner;
import java.util.Arrays;

public class Jurnal03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // Input jumlah mahasiswa
        int jumlahBarang = input.nextInt();
        input.nextLine(); // Buang new line

        // Buat Array
        String[] data = new String[jumlahBarang];

        // Membaca input untuk array
        for (int i = 0; i < jumlahBarang; i++) {
            data[i] = input.next(); // Gunakan next() agar membaca kata per kata (seperti contoh soal)
        }

        // Buang new line
        input.nextLine();

        // Mengurutkan data
        Arrays.sort(data);

        // Input key yang dicari
        String key = input.nextLine();

        // Lakukan pencarian dengan Binary Search
        int result = binarySearch(data, key);

        // Cek hasil pencarian
        if (result != -1) {
            System.out.println("Ditemukan di indeks ke-" + result);
        } else {
            System.out.println("Data tidak ditemukan");
        }

        // Menutup Scanner
        input.close();
    }

    public static int binarySearch(String[] data, String key) {

        int low = 0;
        int high = data.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Hindari over flow

            // Cek apakah elemen tengah adalah target
            if (data[mid].equals(key)) {
                return mid;
            }

            // Jika target lebih kecil dari elemen tengah, cari di kiri
            if (key.compareTo(data[mid]) < 0) {
                high = mid - 1;
            } else {
                // Jika target lebih besar, cari di kanan
                low = mid + 1;
            }
        }

        return -1; // Elemen tidak ditemukan
    }
}
