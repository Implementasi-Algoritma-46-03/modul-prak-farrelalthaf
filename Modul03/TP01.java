import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner sc = new Scanner(System.in);

        // Baca input: 500000 10000 30
        int X = sc.nextInt(); // tabungan awal
        int Y = sc.nextInt(); // jumlah tabungan per hari
        int N = sc.nextInt(); // jumlah hari

        // Hitung total tabungan
        int total = X + (Y * N);

        // Tampilkan hasil
        System.out.println(total);

        sc.close();

    }
}
