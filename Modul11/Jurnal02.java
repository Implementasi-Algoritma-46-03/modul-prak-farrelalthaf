import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // Input sebuah baris kalimat berisi spasi ganda
        String kalimat = input.nextLine();

        // Array
        String[] kata = kalimat.split(" ");
        
        // Inisialisasi variabel hasil
        String hasil = "";

        // For-each
        for (String k : kata) {
            if (!k.equals("")) {
                hasil += k + " ";
            }
        }

        // Menampilkan hasil
        System.out.println(hasil.trim());
    }
}
