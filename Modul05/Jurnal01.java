import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // input sebuah pesanan dan kode menu makanan yang dipesan
        int kodeMenu = input.nextInt();
        int jumlahMakanan = input.nextInt();
        double totalHarga = 0;

        switch (kodeMenu) {
            case 1:
                totalHarga = jumlahMakanan * 15.000;
                System.out.printf("Nasi Goreng " + jumlahMakanan + " buah, " + "total harga Rp. " + "%.3f", totalHarga);
                break;
            case 2:
                totalHarga = jumlahMakanan * 18.000;
                System.out.printf("Mie Goreng / Nyemek " + jumlahMakanan + " buah, " + "total harga Rp. " + "%.3f", totalHarga);
                break;
            case 3:
                totalHarga = jumlahMakanan * 20.000;
                System.out.printf("Kwetiau Goreng / Nyemek " + jumlahMakanan + " buah, " + "total harga Rp. " + "%.3f", totalHarga);
                break;
            case 4:
                totalHarga = jumlahMakanan * 23.000;
                System.out.printf("Capcay Goreng / Kuah " + jumlahMakanan + " buah, " + "total harga Rp. " + "%.3f", totalHarga);
                break;
        }
    }
}