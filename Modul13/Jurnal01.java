import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // Input jumlah barang
        int jumlahBarang = input.nextInt();
        input.nextLine(); // Buang new line

        // Input data inventaris dengan menyimpannya di Array
        String[] data = input.nextLine().split(" ");

        // Insertion Sort
        insertionSort(data);

        // Menutup Scanner
        input.close();
    }

    // Method Insertion Sort
    public static void insertionSort(String[] data) {

        int jumlahBarang = data.length;

        for (int i = 1; i < jumlahBarang; i++) { // Perulangan dari elemen kedua
            String key = data[i]; // Elemen yang akan diurutkan
            int j = i - 1;

            // Geser elemen yang lebih kecil dari key ke kanan
            while (j >= 0 && data[j].compareTo(key) < 0) {
                data[j + 1 ] = data[j];
                j = j - 1; 
            }

            // Masukkan key ke posisi yang benar
            data[j + 1] = key;
        }

        // Output hasil sorting
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.print(data[i]);
            if (i < jumlahBarang - 1) System.out.print(" ");
        }
    }
}
