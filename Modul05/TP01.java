import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // input baris berisi bulan Januari sampai Desember
        String bulan = input.next();
        
        switch (bulan) {
            case "januari":
                System.out.println("janvier");
                break;
            case "februari":
                System.out.println("février");
                break;
            case "maret":
                System.out.println("mars");
                break;
            case "april":
                System.out.println("avril");
                break;
            case "mei":
                System.out.println("mai");
                break;
            case "juni":
                System.out.println("juin");
                break;
            case "juli":
                System.out.println("juillet");
                break;
            case "agustus":
                System.out.println("août");
                break;
            case "september":
                System.out.println("septembre");
                break;
            case "oktober":
                System.out.println("octobre");
                break;
            case "november":
                System.out.println("novembre");
                break;
            case "desember":
                System.out.println("décembre");
                break;
            }
    }
}