import java.util.Scanner;
import java.util.ArrayList;

public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // ArrayList untuk menampung data
        ArrayList<String> namaPeserta = new ArrayList<>();

        // While
        while (true) {
            String nama = input.nextLine();

            // Cek jika input adalah tanda strip "-"
            if (nama.equals("-")) {
                break;
            }

            // Jika bukan "-", maka akan dimasukkan ke dalam ArrayList
            namaPeserta.add(nama);
        }

        // For loop
        for (int i = 0; i < namaPeserta.size(); i++) {
            System.out.println("Bulan " + (i + 1) + ": " + namaPeserta.get(i));
        }

        // Menutup Scanner
        input.close();
    }
}
