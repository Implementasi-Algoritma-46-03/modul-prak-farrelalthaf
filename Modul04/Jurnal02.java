import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // input jumlah penghasilan (N) dalam juta rupiah
        int nilaiN = input.nextInt();
        int penghasilan1 = nilaiN * 1000000;
        double jumlahPajak = 0;
        String pajak = ""; 

        // hasil perhitungan pajak dan sisa penghasilan setelah membayar pajak
        if (nilaiN <= 50) {
            jumlahPajak = penghasilan1 * 0.05;
            pajak = "5%";
        } else if (nilaiN >= 51 && nilaiN <= 250) {
            jumlahPajak = penghasilan1 * 0.15;
            pajak = "15%";
        } else if (nilaiN >= 251 && nilaiN <= 500) {
            jumlahPajak = penghasilan1 * 0.25;
            pajak = "25%";
        } else if (nilaiN > 500) {
            jumlahPajak = penghasilan1 * 0.30;
            pajak = "30%";
        }

        int hasilPajak = (int) jumlahPajak;
        int penghasilanBersih = penghasilan1 - hasilPajak;

        // menampilkan hasil
        System.out.println("Penghasilan kotor = " + nilaiN + " " + "juta Rupiah");
        System.out.println("Pajak " + pajak + " = Rp. " + hasilPajak);
        System.out.println("Penghasilan bersih = " + "Rp. " + penghasilanBersih);
    }
}
