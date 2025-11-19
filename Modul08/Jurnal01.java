import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // Input dua bilangan bulat R dan N
        int R = input.nextInt();
        int N = input.nextInt();

        // Inisialisasi dan casting
        double sisaZat = (double) R;

        // While
        while (N >= 10) {
            sisaZat = sisaZat / 2.0; // Zat berkurang setengah setiap 10 hari
            N = N - 10; // Hari berkurang 10
        }
        
        // Tampilkan hasil
        System.out.printf("%.3f\n", sisaZat);

        input.close();
    }
}
