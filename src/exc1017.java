import java.util.Locale;
import java.util.Scanner;

public class exc1017 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int horas = scanner.nextInt();
        int kmh = scanner.nextInt();
        double automovel = 12;
        double distancia;
        double litros;

        distancia = horas * kmh;
        litros = distancia / automovel;
        Locale.setDefault(Locale.US);
        System.out.printf("%.3f ",litros);





        scanner.close();
    }
}
