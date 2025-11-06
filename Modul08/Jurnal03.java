import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

         // Input sebuah bilangan bulat yang diuji
         int bilanganBulat = input.nextInt();
         int nilaiBilanganBulatSementara = bilanganBulat;
         int totalFaktorial = 0;

         // Loop untuk memproses setiap digit
         while (nilaiBilanganBulatSementara > 0) {
            int digit = nilaiBilanganBulatSementara % 10; // Ambil digit terakhir
            int faktorial = 1;
            int i = 1;

            // Loop untuk menghitung faktorial digit saat ini
            while (i <= digit) {
                faktorial *= i;
                i++;
            }

            totalFaktorial += faktorial;
            nilaiBilanganBulatSementara /= 10; // Buang digit terakhir
         }

         // Mengecek kondisi 
         if (totalFaktorial == bilanganBulat && bilanganBulat > 0) {
            System.out.println("YA");
         } else {
            System.out.println("BUKAN");
         }

         input.close();
    }
}
