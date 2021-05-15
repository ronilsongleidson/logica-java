import java.util.Locale;
import java.util.Scanner;

public class exc1006 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        int peso2 = 2;
        int peso3 = 3;
        int peso5 = 5;
        double peso;
        double media;

        peso = (A * peso2) + (B * peso3) + (C * peso5);
        media = peso / (peso2 + peso3 + peso5);

        System.out.println("Media = " + media);

        scanner.close();
    }
}
