/*
Fazer um programa para ler as medidas da largura e comprimento de um terreno  retangular com uma casa decimal,
bem como o valor do metro quadrado do terreno  com duas casas decimais.
Em seguida, o programa deve mostrar o valor da área do  terreno, bem como o valor do preço do terreno,
ambos com duas casas decimais,  conforme exemplo.
Exemplo:

 Entrada:       Saída:
10.0            AREA = 300.00
30.0            PRECO = 60000.00
200.00

 */

import java.util.Scanner;

public class CalculaFatura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minutos = scanner.nextInt();

        double conta = 50.0;
        if(minutos > 100){
            conta = conta + (minutos - 100 ) * 2.0;
        }
        System.out.printf("Valor da conta =  R$ %.2f%n", conta);
        System.out.println("fim do programa");
        scanner.close();
    }
}