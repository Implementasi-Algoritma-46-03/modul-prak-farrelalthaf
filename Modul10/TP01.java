public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        // Inisiasi variabel untuk menyimpan nilai 5
        int putaran = 5;

        // For loop
        for (int i = putaran; i >= 1; i--) {
            // Nested For untuk membuat polanya
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }

            // Menampilkan hasil
            System.out.println();
        }
    }
}
