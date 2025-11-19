public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        // Inisiasi variabel untuk menentukan batas bilangan prima
        int batas = 100;

        // For loop
        for (int i = 2; i <= batas; i++) {
            // Asumsi awal i adalah bilangan prima
            boolean apakahPrima = true;
            // Nested For
            for (int j = 2; j < i; j++) {
                // Mengecek kondisi apakah i bilangan prima atau bukan
                if (i % j == 0) {
                    apakahPrima = false;
                    break; 
                }
            }
            
            // Mengecek kondisi setelah loop selesai
            if (apakahPrima) {
                System.out.print(i + " ");
            }
        }
        
        // Mencetak hasil
        System.out.println();
    }
}
