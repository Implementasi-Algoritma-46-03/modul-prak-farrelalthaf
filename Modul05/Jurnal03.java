import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner in = new Scanner(System.in);
        int angka1 = in.nextInt();
        char c = in.next().charAt(0);
        int angka2 = in.nextInt();
        double total = 0;


        switch (c) {
            case '+':
                total = angka1 + angka2;
                break;
            case '-':
                total = angka1 - angka2;
                break;
            case '*':
                total = angka1 * angka2;
                break;
            case '/':
                total = angka1 / angka2;
            default:
                break;
        }
        if (c == '/'){
            System.out.println(total);
        }else{
            System.out.println((int) total);
        }


    }
}