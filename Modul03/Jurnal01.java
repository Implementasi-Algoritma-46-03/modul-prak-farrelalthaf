import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // Input jumlah uang
        int jumlahUang = input.nextInt();

        // Hitung lembar Rp1000
        int lembar1000 = jumlahUang / 1000;

        // Hitung sisa uang
        int sisa = jumlahUang % 1000;

        // Tampilkan hasil
        System.out.println(lembar1000);
        System.out.println(sisa);


        input.close();
    }
}
