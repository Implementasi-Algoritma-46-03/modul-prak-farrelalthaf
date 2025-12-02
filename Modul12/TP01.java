import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // Input sebuah bilangan bulat N di mana 2 <= N <= 10
        int bilanganBulatN = input.nextInt();

        // Array 2D
        int matriks[][] = new int[bilanganBulatN][bilanganBulatN];
        
        // Inisialisasi variabel total
        int total = 0;
        
        // Nested For
        for (int i = 0; i < bilanganBulatN; i++) {
            for (int j = 0; j < bilanganBulatN; j++) {
            matriks[i][j] = input.nextInt();
            total += matriks[i][j];
            }
        }


        // Mencetak hasil
        System.out.println(total);

        // Menutup Scanner
        input.close();
    }
}
