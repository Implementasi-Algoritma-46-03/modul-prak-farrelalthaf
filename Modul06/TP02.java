import java.util.Scanner;

public class TP02 {

    // Method untuk menghapus huruf vokal dari kalimat
    public static String hapusVokal(String kalimat) {
        // Ganti semua huruf vokal (besar & kecil) dengan String kosong
        return kalimat.replaceAll("[aiueoAIUEO]", "");
    }

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        // Input kalimat dari user 
        String kalimat = input.nextLine();

        // Panggil method hapusVokal
        String hasil = hapusVokal(kalimat);

        // Tampilkan hasilnya
        System.out.println(hasil);

        input.close();
    }
}
