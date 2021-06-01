import java.io.PrintStream;
 import java.util.Scanner;

public class CaluculaImcResolvido {

    public static void main(String[] args) {


        double altura = 1.65;

        double peso = 57.80;

        double resultado = peso / Math.pow(altura, 2);

        if (resultado < 18.5){
            System.out.println("Magreza");
        }else if(resultado >= 18.5 && resultado <= 24.9);{
            System.out.println("Normal");
        } if(resultado >= 24.9 && resultado <= 30.0);{
            System.out.println("Sobrepeso");
        } else{
            System.out.println("Obesidade");
        }

        System.out.println(resultado);


    }
}
