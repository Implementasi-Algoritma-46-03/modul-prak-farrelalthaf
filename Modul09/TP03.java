import java.util.Scanner;
import java.math.BigInteger;

public class TP03 {

    // Method rekursif
    public static BigInteger hitungFaktorial(BigInteger n) {
        // Base case
        if (n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        } else {
            // Rekursi: memanggil dirinya sendiri
            return n.multiply(hitungFaktorial(n.subtract(BigInteger.ONE)));
        }
    }

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // Input sebuah bilangan bulat N di mana 1 <= N <= 100 
        BigInteger bilanganN = input.nextBigInteger();

        // Memanggil method 
        BigInteger hasil = hitungFaktorial(bilanganN);

        // Menampilkan hasil
        System.out.println(hasil);

        // Menutup Scanner
        input.close();
    }
}
