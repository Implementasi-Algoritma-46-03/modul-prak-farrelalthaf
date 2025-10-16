import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // input sebuah bilangan bulat N
        int nilaiN = input.nextInt();

        // cek bilangan bulat N apakah faktor dari 24 dan 56 atau bukan
        if (24 % nilaiN == 0 && 56 % nilaiN == 0) {
            System.out.println("Faktor dari 24 dan 56");
        } else {
            System.out.println("Bukan faktor dari 24 dan 56");
        }
    }
}
