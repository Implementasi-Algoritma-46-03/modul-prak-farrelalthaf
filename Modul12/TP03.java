import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // Input sebuah bilangan bulat N di mana 2 <= N <= 10
        int bilanganBulatN = input.nextInt();

        // Array 2D untuk matriks sumber
        int matriks1[][] = new int[bilanganBulatN][bilanganBulatN];
        int matriks2[][] = new int[bilanganBulatN][bilanganBulatN];
        // Array 2D untuk matriks hasil
        int matriks3[][] = new int[bilanganBulatN][bilanganBulatN];
        
        // Nested For untuk membuat matriks1
        for (int i = 0; i < bilanganBulatN; i++) {
            for (int j = 0; j < bilanganBulatN; j++) {
            matriks1[i][j] = input.nextInt();
            }
        }

        // Nested For untuk membuat matriks2
        for (int i = 0; i < bilanganBulatN; i++) {
            for (int j = 0; j < bilanganBulatN; j++) {
                matriks2[i][j] = input.nextInt();
            }
        }

        // Nested For untuk membuat perkalian matriks1 dan matriks2 ke matriks3
        for (int i = 0; i < bilanganBulatN; i++) {
            for (int j = 0; j < bilanganBulatN; j++) {
                // Inisialisasi variabel
                int total = 0;
                for (int k = 0; k < bilanganBulatN; k++) {
                    total = total + matriks1[i][k] * matriks2[k][j];
                }

                matriks3[i][j] = total;
            }
        }

        // Nested For untuk mencetak hasil matriks
        for (int i = 0; i < bilanganBulatN; i++) {
            for (int j = 0; j < bilanganBulatN; j++) {
                System.out.print(matriks3[i][j]);
                if (j < bilanganBulatN - 1) {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
        
        // Menutup Scanner
        input.close();
    }
}
