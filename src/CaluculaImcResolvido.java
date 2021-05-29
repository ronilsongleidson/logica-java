import java.io.PrintStream;
 import java.util.Scanner;

public class CaluculaImcResolvido {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();
        System.out.println("Digite seu peso");
        double peso = scanner.nextDouble();

        double resultado = peso  / Math.pow(altura, 2);

        if (resultado < 18.5){
            System.out.println("Magreza");
        }else if (resultado >= 18.5 && resultado <= 24.9);{
            System.out.println("Normal");
        }else if (resultado >= 24.9 && resultado <= 30.0);{
            System.out.println("Sobrepeso");
        }else{
            System.out.println("Obesidade");
        }

        scanner.close();
    }
}
