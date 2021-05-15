import java.util.Locale;
import java.util.Scanner;

public class exc1010 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int codigo1 = scanner.nextInt(); int numero1 = scanner.nextInt(); double valor1 = scanner.nextDouble();
        int codigo2 = scanner.nextInt(); int numero2 = scanner.nextInt(); double valor2 = scanner.nextDouble();

        double VN1;
        double VN2;
        double RESULTADO;

        VN1 = numero1 * valor1;
        VN2 = numero2 * valor2;
        RESULTADO = VN1 + VN2;


        System.out.printf("VALOR A PAGAR R$ %.2f%n ", + RESULTADO);


        scanner.close();
    }
}
