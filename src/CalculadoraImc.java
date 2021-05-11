import java.util.Locale;
import java.util.Scanner;

public class CalculadoraImc {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Sua idade");
    double Idade = scanner.nextDouble();

     System.out.println("Digite sua altura");
    double Altura = scanner.nextDouble();

        System.out.println("Digite o seu peso");
    double Peso = scanner.nextDouble();


    double resultado = ( Peso / (Altura * Altura) ) ;

        System.out.printf("%.2f%n",Idade);
        System.out.printf("%.4f%n",Altura);
        System.out.printf("%.2f%n",Peso);

        System.out.println(resultado);

        scanner.close();
}
    }
