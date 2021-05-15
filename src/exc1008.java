import java.util.Locale;
import java.util.Scanner;

public class exc1008 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int funcionario = scanner.nextInt();
        int horas = scanner.nextInt();

        double valor = scanner.nextDouble();
        double salario;


        salario = valor * horas;


        System.out.println("Numero = " + funcionario);
        Locale.setDefault(Locale.US);
        System.out.printf("Salario U$ = %.2f%n  ", salario);




        scanner.close();

    }
}
