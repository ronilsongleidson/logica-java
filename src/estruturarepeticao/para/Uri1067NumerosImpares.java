package estruturarepeticao.para;

import java.util.Scanner;

public class Uri1067NumerosImpares {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x>= 1 && x<1000 ) {
            for (int i = 1; i <= x; i++) {
                if (i % 2 != 0) {           // usando modulo para converter em impar
                    System.out.println(i);
                }
            }
        }

        scanner.close();

    }
}
