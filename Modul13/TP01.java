import java.util.Scanner;
import java.util.Locale;

public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // Buat Array
        double[] gelombang1 = new double[10];
        double[] gelombang2 = new double[10];

        // Membaca input untuk gelombang1
        for (int i = 0; i < 10; i++) {
            gelombang1[i] = input.nextDouble();
        }

        // Membaca input untuk gelombang2
        for (int i = 0; i < 10; i++) {
            gelombang2[i] = input.nextDouble();
        }

        // Proses Sorting
        bubbleSort1(gelombang1);
        bubbleSort2(gelombang2);

        // Output
        // Cetak gelombang1
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f ", gelombang1[i]);
            if (i < 9) {
                System.out.print(" ");
            }
        }

        System.out.println();

        // Cetak gelombang2
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f ", gelombang2[i]);
            if (i < 9) {
                System.out.print(" ");
            }
        }

        System.out.println();
    }



    // Method Bubble Sort untuk gelombang1
    public static void bubbleSort1(double[] gelombang1) {
        
        for (int i = 1; i < 10; i++) {
            // Membandingkan elemen berurutan
            for (int j = 10 - 1; j >= i; j--) {
                if (gelombang1[j] < gelombang1[j - 1]) {
                    // Menukar elemen jika elemen saat ini lebih besar
                    double temp = gelombang1[j];
                    gelombang1[j] = gelombang1[j - 1];
                    gelombang1[j - 1] = temp;
                }
            }
        }
    }

    // Method Bubble Sort untuk gelombang2
    public static void bubbleSort2(double[] gelombang2) {
        
        for (int i = 1; i < 10; i++) {
            // Membandingkan elemen berurutan
            for (int j = 10 - 1; j >= i; j--) {
                if (gelombang2[j] < gelombang2[j - 1]) {
                    // Menukar elemen jika elemen saat ini lebih besar
                    double temp = gelombang2[j];
                    gelombang2[j] = gelombang2[j - 1];
                    gelombang2[j - 1] = temp;
                }
            }
        }
    }
}
