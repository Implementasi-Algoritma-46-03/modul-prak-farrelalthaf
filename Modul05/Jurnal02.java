import java.util.Scanner;

public class Jurnal02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String hariAwal = input.nextLine();
        int n = input.nextInt();

        int namaHari = 0;
        switch (hariAwal) {
            case "Senin":
                namaHari = 0;
                break;
            case "Selasa":
                namaHari = 1;
                break;
            case "Rabu":
                namaHari = 2;
                break;
            case "Kamis":
                namaHari = 3;
                break;
            case "Jum'at":
                namaHari = 4;
                break;
            case "Sabtu":
                namaHari = 5;
                break;
            case "Minggu":
                namaHari = 6;
                break;
            default:
                System.out.println("Hari tidak valid");
                return;
        }

        int indexHasil = (namaHari + n) % 7;

        String hasilHari;
        switch (indexHasil) {
            case 0:
                hasilHari = "Senin";
                break;
            case 1:
                hasilHari = "Selasa";
                break;
            case 2:
                hasilHari = "Rabu";
                break;
            case 3:
                hasilHari = "Kamis";
                break;
            case 4:
                hasilHari = "Jum'at";
                break;
            case 5:
                hasilHari = "Sabtu";
                break;
            case 6:
                hasilHari = "Minggu";
                break;
            default:
                hasilHari = "Hari tidak valid"; 
        }

        System.out.println(hasilHari);
    }
}