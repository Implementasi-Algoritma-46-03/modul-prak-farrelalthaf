import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // input bilangan bulat N
        int  bilanganBulatN = input.nextInt();

        // variabel double untuk perhitungan desimal
        double diskon = 0;
        double totalSetelahDiskon;
        double pajak;
        double totalDibayar;

        // jika transaksi lebih dari 200000, maka diskon 5%
        if (bilanganBulatN > 200000) {
            diskon = bilanganBulatN * 0.05;
        }

        // total setelah di diskon
        totalSetelahDiskon = bilanganBulatN - diskon;

        // hitung pajak setelah di diskon
        pajak = totalSetelahDiskon * 0.11;

        // total akhir
        totalDibayar = totalSetelahDiskon + pajak;

        // hasil tampilan
        System.out.println("Transaksi = " + bilanganBulatN);
        if (diskon > 0) {
            // baris ini hanya berjalan jika ada diskon
            System.out.println("Total = " + bilanganBulatN + " - " + (int)diskon);
        } else {
            // baris ini hanya berjalan jika tidak ada diskon
            System.out.println("Total = " + bilanganBulatN);
        }
        System.out.println("Ppn 11% = " + pajak);
        System.out.println("Total dibayar = " + totalDibayar);

        input.close();
    }
}
