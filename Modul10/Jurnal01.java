public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        // For loop untuk membuat baris
        for (int i = 1; i <= 6; i++) {
            // Nested If untuk membuat spasi di 2, 4, dan 6
            if (i % 2 == 0) {
                System.out.print(" ");
            }
            // Nested For untuk membuat kolom
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + " ");
            }

            // Menampilkan hasil
            System.out.println();
        }
    }
}
