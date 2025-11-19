import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // Input bilangan bulat N di mana 1 <= N <= 10
        int n = input.nextInt();

        // For loop untuk membuat pola naik
        for (int i = 1; i <= n; i++) {
            // Nested For untuk membuat pola spasi zig zag
            for (int k = 1; k <= i - 1; k++) { 
                System.out.print(" "); 
            }
            
            // Menampilkan hasil
            System.out.println(i);
        }

        // For loop untuk membuat pola turun
        for (int i = n - 1; i >= 1; i--) { 
            // Nested For untuk membuat pola spasi zig zag
            for (int k = 1; k <= i - 1; k++) { 
                System.out.print(" "); 
            }
            
            // Menampilkan hasil
            System.out.println(i); 
        }
        
        // Menutup Scanner
        input.close();
    }
}
