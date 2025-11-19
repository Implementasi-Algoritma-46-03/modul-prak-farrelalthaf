import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int T = input.nextInt();

        int totalOrang = T + 1;
        
        int jatah = N / totalOrang;
        int sisa = N % totalOrang;

        //Output
        System.out.println(jatah);
        System.out.println(sisa);

        input.close();

    }
}
