import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner in = new Scanner(System.in);
        int angka1 = in.nextInt();
        char c = in.next().charAt(0);
        int angka2 = in.nextInt();


        switch (c) {
            case '+':
                // total = angka1 + angka2;
                System.out.println(angka1 + angka2);
                break;
            case '-':
                // total = angka1 - angka2;
                System.out.println(angka1 - angka2);
                break;
            case '*':
                // total = angka1 * angka2;
                System.out.println(angka1 * angka2);
                break;
            case '/':
                // total = angka1 / angka2;
                System.out.printf("%.7f%n", (double) angka1 / angka2);
                break;
            default:
                System.out.println("Tidak valid");
                break;
        }
        in.close();
    }
}