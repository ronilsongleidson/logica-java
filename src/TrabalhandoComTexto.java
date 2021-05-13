import java.util.Locale;
import java.util.Scanner;

public class TrabalhandoComTexto {


    public static void main(String[] args){

        // Criar mensagem que solicita ao ussuario o nome e idade //
        Locale.setDefault(Locale.US);
         Scanner scanner = new Scanner(System.in); {

            System.out.println("Digite o seu nome");
            String nome = scanner.nextLine();

            System.out.println("Digite a sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite a sua altura");
            double altura = scanner.nextDouble();

            System.out.println("Digite o seu peso");
            double peso = scanner.nextDouble();

            //processamento
            System.out.printf("Oi, meu nome é %s, tenho  %d anos, minha altura é %.2f e estou pesando %.2f Kg ", nome, idade, altura, peso);


            //SAIDA DE DADOS


            scanner.close();
        }

    }


}
