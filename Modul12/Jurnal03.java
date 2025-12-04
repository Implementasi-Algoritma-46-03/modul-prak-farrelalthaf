import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        int masukan = in.nextInt();

        int mulai = 0;
        int counter = 0;
        int akhir = masukan;
        int loop = 0;
        
        int[][] matriks = new int[masukan][masukan]; // Membuat Array2D

        while (akhir > 0) {
            for (int i = mulai; i<akhir; i++) {
                counter++;
                matriks[i + loop][mulai+loop] = counter; // Kolom paling kiri ke bawah
            }
            akhir--;
            for (int i= mulai; i<akhir; i++) {
                counter++;
                matriks[akhir + loop][i+ 1+ loop] = counter; // Paling bawah kiri ke kanan
            }
            for (int i = mulai; i<akhir; i++) {
                counter++;
                matriks[akhir - i - 1 + loop][akhir + loop] = counter; // Kolom kanan dari bawah ke atas
            }
            akhir--;
            for (int i = mulai; i<akhir; i++) {
                counter++;
                matriks[mulai+loop][akhir - i + loop] = counter; // Baris atas dari kanan ke kiri
            }
            loop++;
        }        

        for (int i=0; i<masukan; i++) {
            for (int j=0; j<masukan; j++) {
                System.out.print(matriks[i][j]);
                if (j < masukan - 1)
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}