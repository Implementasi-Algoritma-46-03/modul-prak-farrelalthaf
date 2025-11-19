import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        // input 3 buah bilangan bulat
        int nilaiD = input.nextInt();
        int nilaiR = input.nextInt();
        int nilaiI = input.nextInt();

        // nilai tertinggi
        if (nilaiD > nilaiR && nilaiD > nilaiI) {
            System.out.println("Dira");
        } else if (nilaiR > nilaiD && nilaiR > nilaiI) {
            System.out.println("Radi");
        } else {
            System.out.println("Idar");
        }
        
        input.close();
    }
}
