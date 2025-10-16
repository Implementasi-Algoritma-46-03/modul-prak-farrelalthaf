import java.util.Scanner;

public class TP03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namaBangun = input.nextLine();

        double luas = 0;
        double keliling = 0;

        switch (namaBangun) {
            case "Persegi":
                int sisi = input.nextInt();
                luas = sisi * sisi;
                keliling = 4 * sisi;
                System.out.printf("%d %d", (int) luas, (int) keliling);
                break;

            case "Persegi Panjang":
                int panjang = input.nextInt();
                int lebar = input.nextInt();
                luas = panjang * lebar;
                keliling = 2 * (panjang + lebar);
                System.out.printf("%d %d", (int) luas, (int) keliling);
                break;

            case "Segitiga":
                int alas = input.nextInt();
                int tinggi = input.nextInt();
                luas = 0.5 * alas * tinggi;
                double miring = Math.sqrt(alas * alas + tinggi * tinggi);
                keliling = alas + tinggi + Math.round(miring);
                System.out.printf("%d %d", (int) luas, (int) keliling);
                break;

            case "Lingkaran":
                int diameter = input.nextInt();
                double r = diameter / 2.0;
                luas = 3.14 * r * r;
                keliling = 3.14 * diameter;
                System.out.printf("%.2f %.2f", luas, keliling);
                break;
        }
    }
}