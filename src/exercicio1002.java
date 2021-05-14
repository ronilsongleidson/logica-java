import java.util.Scanner;

class exercicio1002 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n = 3.14159;
        double raio = scanner.nextDouble();
        double area;

// OBS: Tinha feito sem elevar a potencia, fiquei na duvida se estaria correto e coloquei depois

        area = n * Math.pow(raio, 2.00);

        System.out.printf("A=%.4f", area);

        scanner.close();

    }
}