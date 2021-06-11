package estruturarepeticao.enquanto;

public class Ex04 {

    public static void main(String[] args) {

        int x = 0;
        int y = 0;
        while (x < 5){
            y = x * 3;
            System.out.println(y);
            x = x + 1;
        }
        System.out.println("fim");
    }
}
