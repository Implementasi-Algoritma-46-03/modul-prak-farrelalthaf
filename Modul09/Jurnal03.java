import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // Input bilangan bulat N di mana 1 <= N <= 1000
        int nPrima = input.nextInt(); 

        // Mengecek kondisi
        if (nPrima == 1) {
            System.out.println("BUKAN");
        } else {
            boolean apakahPrima = true;
            // For loop
            for (int i = 2; i < nPrima; i++) {
                // Mengecek kondisi di dalam For loop
                if (nPrima % i == 0) {
                    apakahPrima = false;
                    break;
                }
            }

            // Mengecek kondisi setelah loop selesai
            if (apakahPrima == true) {
                System.out.println("YA");
            } else {
                System.out.println("BUKAN");
            }
        }

        // Menutup Scanner
        input.close();
    }
}