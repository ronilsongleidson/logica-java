/*
Suponha um programa que solicita ao usuario dois numeros e epois mostra a media aritmetica deles:

    Ex:
        *** ENTRADA DE DADOS***
        Digite o primeiro numero: 3
        /digite o segundo numero: 6


        ***PROCESSAMENTO***

        MEDIA = (3 + 6) / 2

        ***SAIDA DE DADOS***
        Media aritimetica: 4.5

 */

import java.util.Locale;
import java.util.Scanner;

public class CalculaMediaAritimetica {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner  = new Scanner(System.in);

        //*** ENTRADA DE DADOS***
        System.out.println("Digite o primeiro valor");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("Digite o segundo valor");
        double segundoNumero = scanner.nextDouble();

        //***PROCESSAMENTO***
        double resultado = (primeiroNumero + segundoNumero) / 2;

        //***SAIDA DE DADOS***
        System.out.printf("O resultado é %.2f " , resultado);


    }
}

