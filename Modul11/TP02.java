import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class TP02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;          // tidak ada input sama sekali
        int N = s.nextInt();
        Integer[] poin = new Integer[N];
        int count = 0;
        while (count < N && s.hasNextInt()) { // baca sampai N atau sampai input habis
            poin[count++] = s.nextInt();
        }
        // jika input kurang dari N, isi sisa dengan 0 (atau keputusan lain sesuai soal)
        for (int i = count; i < N; i++) poin[i] = 0;

        Arrays.sort(poin, Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            System.out.print(poin[i]);
            if (i < N - 1) System.out.print(" ");
        }
        s.close();
    }
}