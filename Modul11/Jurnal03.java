import java.util.Scanner;
import java.util.ArrayList;

public class Jurnal03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        
        // Inisialisasi variabel
        int counter;
        int hasilAkhir = 0;
        int a;
        int modus = 0;

        // ArrayList
        ArrayList<Integer> arr = new ArrayList<>();

        // Do-While
        do {
            a = input.nextInt();
            if (a != -1)
                arr.add(a);
        } while (a != -1);

        // For Loop
        for (int i = 0; i<arr.size(); i++) {
            counter = 0;
            // Nested For
            for (int j = 0; j<arr.size(); j++) {
                // Mengecek kondisi
                if (arr.get(i).equals(arr.get(j))){
                    counter++;
                }
            }

            // Mengecek kondisi
            if (counter > hasilAkhir || (counter == hasilAkhir && arr.get(i) > modus)) {
                hasilAkhir = counter;
                modus = arr.get(i);
            }
        }

        // Menampilkan hasil
        System.out.println(modus);
    }
}