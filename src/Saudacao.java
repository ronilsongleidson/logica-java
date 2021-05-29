import java.util.Scanner;

public class Saudacao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Horario Atual");
        int HoraAtual = scanner.nextInt();
        if (HoraAtual < 12 ){
            System.out.printf("Bom dia");
        }else if (HoraAtual >= 12 && HoraAtual < 18){
            System.out.printf("Boa tarde");
        }else {
            System.out.println("Boa noite");
        }


        scanner.close();

    }
}
