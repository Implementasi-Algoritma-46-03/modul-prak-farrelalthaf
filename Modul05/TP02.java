import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // input sebuah baris berisi bilangan bulat N
        int nilaiN = input.nextInt();

        // hari ini adalah hari Jumat (vendredi), mempunyai index 4
        int indexHariIni = 4;

        // hitung hari ke berapa setelah N hari
        int indexHariBaru = (indexHariIni + nilaiN) % 7;

        // menampilkan nama hari yang jatuh N hari setelah setelah hari ini (Jumat/vendredi)
        switch (indexHariBaru) {
            case 0:
                System.out.println("lundi"); // senin
                break;
            case 1:
                System.out.println("mardi"); // selasa
                break;
            case 2:
                System.out.println("mercredi"); // rabu
                break;
            case 3:
                System.out.println("jeudi"); // kamis
                break;
            case 4:
                System.out.println("vendredi"); // jumat
                break;
            case 5:
                System.out.println("samedi"); // sabtu
                break;
            case 6:
                System.out.println("dimanche"); // minggu
                break;
        }
    }
}