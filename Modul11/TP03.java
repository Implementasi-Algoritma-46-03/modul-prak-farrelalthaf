import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // Input sebuah kalimat
        String kalimat = input.nextLine();

        // Trim untuk hapus spasi di awal dan di akhir kalimat
        kalimat = kalimat.trim();

        // Mengecek kondisi apakah kalimat kosong?
        if (kalimat.isEmpty()) {
            System.out.println(0);
        } else {
            // Menghapus spasi antar kalimat
            String[] daftarKata = kalimat.split("\\s+");
            System.out.println(daftarKata.length);
        }

        // Menutup Scanner
        input.close();
    }
}
