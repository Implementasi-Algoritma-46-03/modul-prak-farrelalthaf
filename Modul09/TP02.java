import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // Input sebuah baris kalimat dengan huruf kecil
        String kalimat = input.nextLine();

        // Inisiasi variabel jumlah vokal
        int jumlahVokal = 0;

        // For loop
        for (int i = 0; i < kalimat.length(); i++) {
            // Ambil satu huruf di posisi 'i' saat ini 
            char huruf = kalimat.charAt(i);
            // Cek apakah huruf itu salah satu dari vokal
            if (huruf == 'a' || huruf == 'i' || huruf == 'u' || huruf == 'e' || huruf == 'o') {
                jumlahVokal++;
            }
        }

        // Mencetak hasil
        System.out.println(jumlahVokal);

        // Menutup Scanner
        input.close();
    }
}
