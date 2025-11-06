import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        int totalRisoles = 0;
        int jumlahPembeli = 0;

        // Membaca input pertama sebelum masuk loop
        int bilanganBulat = input.nextInt();

        // Loop berjalan selama input bukan 0
        while (bilanganBulat != 0) {
            totalRisoles += bilanganBulat;
            jumlahPembeli++;
            bilanganBulat = input.nextInt(); // Membaca input berikutnya
        }

        // Menghitung dan menampilkan rata rata jika ada pembeli
        if (jumlahPembeli > 0) {
            double rataRata = (double) totalRisoles / jumlahPembeli;
            System.out.printf("%.2f\n", rataRata);
        } else {
            System.out.println("0.00"); // Jika tidak ada yang beli
        }

        input.close();
    }
}
