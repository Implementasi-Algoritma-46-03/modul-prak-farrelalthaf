import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // input 3 buah bilangan bulat yang berbeda
        int nilaiDira = input.nextInt();
        int nilaiRadi = input.nextInt();
        int nilaiIdar = input.nextInt();

        // menampilkan nilai terendah ke nilai tertinggi
         if (nilaiDira < nilaiRadi && nilaiRadi < nilaiIdar) {
            System.out.println("Dira, Radi, Idar");
        } else if (nilaiDira < nilaiIdar && nilaiIdar < nilaiRadi) {
            System.out.println("Dira, Idar, Radi");
        } else if (nilaiRadi < nilaiDira && nilaiDira < nilaiIdar) {
            System.out.println("Radi, Dira, Idar");
        } else if (nilaiRadi < nilaiIdar && nilaiIdar < nilaiDira) {
            System.out.println("Radi, Idar, Dira");
        } else if (nilaiIdar < nilaiDira && nilaiDira < nilaiRadi) {
            System.out.println("Idar, Dira, Radi");
        } else {
            System.out.println("Idar, Radi, Dira");
        }
    }
}