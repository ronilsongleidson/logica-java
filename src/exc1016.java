import java.util.Scanner;

public class exc1016 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int distancia = scanner.nextInt();
        int tempo = 2;
        int minutos;

        minutos = distancia * tempo;

        System.out.println(minutos + " minutos ");

        scanner.close();
    }
}
