import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // Input sebuah bilangan bulat N di mana 2 <= N <= 10
        int bilanganBulatN = input.nextInt();

        // Array 2D
        int matriks[][] = new int[bilanganBulatN][bilanganBulatN];
        
        // Nested For untuk membuat matriks
        for (int i = 0; i < bilanganBulatN; i++) {
            for (int j = 0; j < bilanganBulatN; j++) {
            matriks[i][j] = input.nextInt();
            }
        }

        // Nested For untuk mencerminkan matriks
        for (int i = bilanganBulatN - 1; i >= 0; i--) {
            for (int j = 0; j < bilanganBulatN; j++) {
                System.out.print(matriks[i][j]); 
                if (j < bilanganBulatN - 1)
                System.out.print(" "); 
            }

            System.out.println();
        }

        // Menutup Scanner
        input.close();
    }
}
