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

public class CalculaMediaAritimetica {

    public static void main(String[] args){

        //*** ENTRADA DE DADOS***
        double primeiroNumero = 9;
        double segundoNumero = 8;

        //***PROCESSAMENTO***
        double resultado = (primeiroNumero + segundoNumero) / 2;

        //***SAIDA DE DADOS***
        System.out.println("O resultado e " + resultado);

    }
}

