import java.util.Scanner;

public class CalculadoraImc {

    public static void main(String[] args){

        Scanner scanner  = new Scanner(System.in);

     System.out.println("Digite sua altura");
    double Altura = scanner.nextDouble();

        System.out.println("Digite o seu peso");
    double Peso = scanner.nextDouble();


    double resultado = (Peso / (Altura * Altura) ) ;


        System.out.println("O resultado e " + resultado);
}
    }
