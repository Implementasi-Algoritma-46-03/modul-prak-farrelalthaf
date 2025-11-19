import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
         Scanner input = new Scanner(System.in);

         // input 3 buah nilai ujian
         int Nilai1 = input.nextInt(); 
         int Nilai2 = input.nextInt();
         int Nilai3 = input.nextInt();

         // hitung rata rata
         double nilairatarata = (Nilai1 + Nilai2 + Nilai3)/ 3.0;
         
         // tampilkan hasil
         System.out.printf("Nilai rata-rata: %.2f%n" , nilairatarata);



    }
}
