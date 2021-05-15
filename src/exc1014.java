import java.util.Locale;
import java.util.Scanner;

public class exc1014 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        double Y = scanner.nextDouble();
        double kml;

        kml = X / Y;

        System.out.printf("%.3f Km/1", kml );

        scanner.close();
    }
}
