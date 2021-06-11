package estruturarepeticao.enquanto;

public class Ex03 {

    public static void main(String[] args) {

        double x = 10.0;
        double y = 10.0;

        while (x != y) {
            System.out.println("Olha");
            x = Math.sqrt(y);
        }
    }
}
