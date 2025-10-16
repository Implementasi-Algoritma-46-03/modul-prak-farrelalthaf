import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // input sebuah bangun datar dan bilangan bulat
        String bangunDatar = input.nextLine();
        double luas = 0;
        double keliling = 0;
        
        // tentukan luas dan keliling sebuah bangun datar
        switch (bangunDatar) {
            case "Persegi":
                int sisi = input.nextInt();
                luas = sisi * sisi;
                keliling = 4 * sisi;
                System.out.println((int)luas + " " + (int)keliling);
                break;
            case "Persegi Panjang":
                int panjang = input.nextInt();
                int lebar = input.nextInt();
                luas = panjang * lebar;
                keliling = 2 * (panjang + lebar);
                System.out.println((int)luas + " " + (int)keliling);
                break;
            case "Segitiga":
                int alas = input.nextInt();
                int tinggi = input.nextInt();
                luas = 0.5 * alas * tinggi;
                keliling = alas + tinggi + Math.sqrt(alas * alas + tinggi * tinggi);
                System.out.println((int)luas + " " + (int)keliling);
                break;
            case "Lingkaran":
                int diameter = input.nextInt();
                double pi = 3.14;
                double r =  diameter / 2.0;
                luas = pi * r * r;
                keliling = pi * diameter;
                System.out.println(luas + " " + keliling);
                break;
        }
    }
}