import java.util.Locale;
import java.util.Scanner;

public class exc1005 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double peso1 = 3.5;
        double peso2 = 7.5;
        double peso;
        double media;

        peso = A * peso1 + B * peso2;
        media = peso / (peso1 + peso2);

        System.out.printf("MEDIA = %.5f%n", media);

        scanner.close();
    }
}
