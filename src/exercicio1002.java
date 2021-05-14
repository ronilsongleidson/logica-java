import java.util.Scanner;

class exercicio1002 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n = 3.14159;
        double raio = scanner.nextDouble();
        double area;


        area = n * (raio * raio);

        System.out.printf("A=%.4f", area);

    }
}