import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

//https://docs.oracle.com/javase/tutorial/java/data/numberformat.html

public class CalculadoraImc {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Idade");
    double Idade = scanner.nextDouble();

     System.out.println("Digite sua altura");
    double Altura = scanner.nextDouble();

        System.out.println("Digite o seu peso");
    double Peso = scanner.nextDouble();


    double resultado = ( Peso / (Altura * Altura) ) ;

        System.out.printf("Minha idade é %s Tenho %.2f e peso %.2f Kg", Idade, Altura, Peso);


        scanner.close();
}
    }
