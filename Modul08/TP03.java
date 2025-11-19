import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        int total = 0;
        int jumlah;

        do {
            jumlah = input.nextInt();
            total += jumlah;
        } while (jumlah != 0);

        System.out.println(total);
    }
}
