import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        ArrayList<Integer> poin = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            poin.add(input.nextInt());
        }

        Collections.sort(poin, Collections.reverseOrder());

        for (int angka : poin) {
            System.out.print(angka + " ");
        }
    }
}