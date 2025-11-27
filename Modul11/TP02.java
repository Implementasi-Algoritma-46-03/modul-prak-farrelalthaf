import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class TP02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        if (!input.hasNextInt()) return;          // Tidak ada input sama sekali
        int N = input.nextInt();
        Integer[] poin = new Integer[N];
        int count = 0;
        while (count < N && input.hasNextInt()) { // Baca sampai N atau sampai input habis
            poin[count++] = input.nextInt();
        }
        // Jika input kurang dari N, isi sisa dengan 0 (atau keputusan lain sesuai soal)
        for (int i = count; i < N; i++) poin[i] = 0;

        Arrays.sort(poin, Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            System.out.print(poin[i]);
            if (i < N - 1) System.out.print(" ");
        }
        input.close();
    }
}