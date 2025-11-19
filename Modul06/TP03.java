import java.util.Scanner;

public class TP03 {

    // Method untuk menghitung luas dan keliling persegi
    public static int luasPersegi(int sisi) {
        return sisi * sisi;
    }

    public static int kelilingPersegi(int sisi) {
        return 4 * sisi;
    }

    // Method untuk menghitung luas dan keliling persegi panjang
    public static int luasPersegiPanjang(int panjang, int lebar) {
        return panjang * lebar;
    }

    public static int kelilingPersegiPanjang(int panjang, int lebar) {
        return 2 * (panjang + lebar);
    }

    // Method untuk menghitung luas dan keliling segitiga (siku-siku)
    public static double luasSegitiga(int alas, int tinggi) {
        return 0.5 * alas * tinggi;
    }

    public static double kelilingSegitiga(int alas, int tinggi) {
        double miring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + miring;
    }

    // Method untuk menghitung luas dan keliling lingkaran
    public static double luasLingkaran(int diameter) {
        double jariJari = diameter / 2.0;
        return 3.14 * jariJari * jariJari;
    }

    public static double kelilingLingkaran(int diameter) {
        return 3.14 * diameter;
    }

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        String namaBangunDatar = input.nextLine();

        double luas = 0;
        double keliling = 0;

        switch (namaBangunDatar) {
            case "Persegi":
                int sisi = input.nextInt();
                luas = luasPersegi(sisi);
                keliling = kelilingPersegi(sisi);
                System.out.printf("%d %d", (int) luas, (int) keliling);
                break;
            
            case "Persegi Panjang":
                int panjang = input.nextInt();
                int lebar = input.nextInt();
                luas = luasPersegiPanjang(panjang, lebar);
                keliling = kelilingPersegiPanjang(panjang, lebar);
                System.out.printf("%d %d", (int) luas, (int) keliling);
                break;

            case "Segitiga":
                int alas = input.nextInt();
                int tinggi = input.nextInt();
                luas = luasSegitiga(alas, tinggi);
                keliling = kelilingSegitiga(alas, tinggi);
                System.out.printf("%d %d", (int) luas, (int) keliling);
                break;

            case "Lingkaran":
                int diameter = input.nextInt();
                luas = luasLingkaran(diameter);
                keliling = kelilingLingkaran(diameter);
                System.out.printf("%.2f %.2f", luas, keliling);
                break;

            default:
                System.out.println("Bangun datar tidak dikenal");
                return;
        }
        
        input.close();
    }
}
