import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String variavelSemEspaco = scanner.next();
        System.out.println(variavelSemEspaco);


        double valorComVirgula = scanner.nextDouble();
        System.out.println(valorComVirgula);


        int valorInteiroSemVirgula = scanner.nextInt();
        System.out.println(valorInteiroSemVirgula);


        char variavelQueRecebeSomenteUmCaracter = scanner.next().charAt(0);
        System.out.println(variavelQueRecebeSomenteUmCaracter);



        String a = scanner.next();
        int y = scanner.nextInt();
        double z = scanner.nextDouble();


// Entrada de Dados
        int x;
        String s1, s2, s3;

        x = scanner.nextInt();
        scanner.nextLine();
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
        s3 = scanner.nextLine();

        System.out.println("DADOS DIGITADOS"); System.out.println(x);
        System.out.println("s1 -> " +s1);
        System.out.println("s2 -> " +s2);
        System.out.println("s3 -> " +s3);


        scanner.close();


    }
}
