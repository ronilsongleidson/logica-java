import java.util.Locale;
import java.util.Scanner;

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
public class ExercicioResolvido {


    public  static void  main(String[]  args) {

        Locale.setDefault(Locale.US);
        Scanner sc  =  new   Scanner(System.in);

        System.out.println("Insira a area");
        double largura = sc.nextDouble();

        System.out.println("Insira o comprimento");
        double comprimento = sc.nextDouble();

        System.out.println("Insira o metro quadrado");
        double metroQuadrado = sc.nextDouble();

        System.out.println();
        double area = largura * comprimento;
        double preco = area * metroQuadrado;


        System.out.printf("SUA AREA É = %.2f%n", area);
        System.out.printf("SEU PRECO É = $ %.2f%n", preco);


        sc.close();
    }

}


