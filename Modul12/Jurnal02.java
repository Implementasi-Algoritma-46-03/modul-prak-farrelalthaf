import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // Input sebuah bilangan bulat N di mana 2 <= N <= 10
        int bilanganBulatN = input.nextInt();

        // Array 2D
        int board[][] = new int[bilanganBulatN][bilanganBulatN];
        
        // Iniasialisasi variabel
        boolean adaKosong = false;
        
        // Nested For untuk membuat papan
        for (int i = 0; i < bilanganBulatN; i++) {
            for (int j = 0; j < bilanganBulatN; j++) {
                board[i][j] = input.nextInt();
                // Mengecek kondisi
                if (board[i][j] == 0) {
                    adaKosong = true;
                }
            }
        }

        // Inisialisasi variabel
        int pemenang = 0;

        // Cek baris dan kolom
        for (int i = 0; i < bilanganBulatN; i++) {
            // Cek baris ke-i
            if (pemenang == 0 && board[i][0] != 0) {
                boolean menang = true;
                for (int j = 1; j < bilanganBulatN; j++) {
                    if (board[i][j] != board[i][0]) {
                        menang = false;
                        break;
                    }
                }

                if (menang) pemenang = board[i][0];
            }

            // Cek Kolom ke-i
            if (pemenang == 0 && board[0][i] != 0) {
                boolean menang = true;
                for (int j = 1; j < bilanganBulatN; j++) {
                    if (board[j][i] != board[0][i]) {
                        menang = false;
                        break;
                    }
                }
                if (menang) pemenang = board[0][i];
            }
        }

        // Cek diagonal (Hanya jika belum ada pemenang)
        if (pemenang == 0) {
            // Diagonal Utama (Kiri-Atas ke Kanan-Bawah)
            if (board[0][0] != 0) {
                boolean menang = true;
                for (int i = 1; i < bilanganBulatN; i++) {
                    if (board[i][i] != board[0][0]) {
                        menang = false;
                        break;
                    }
                }
                if (menang) pemenang = board[0][0];
            }

            // Diagonal Samping (Kanan-Atas ke Kiri-Bawah)
            if (pemenang == 0 && board[0][bilanganBulatN - 1] != 0) {
                boolean menang = true;
                for (int i = 1; i < bilanganBulatN; i++) {
                    if (board[i][bilanganBulatN - 1 - i] != board[0][bilanganBulatN - 1]) {
                        menang = false;
                        break;
                    }
                }
                if (menang) pemenang = board[0][bilanganBulatN - 1];
            }
        }

        // Output
        if (pemenang == 1) {
            System.out.println("O");
        } else if (pemenang == 2) {
            System.out.println("X");
        } else if (adaKosong) {
            System.out.println("?");
        } else {
            System.out.println("-");
        }
        
        
        // Menutup Scanner
        input.close();

    }
}

