package estruturarepeticao.para;

public class usandoFor01 {

    public static void main(String[] args) {

        int x = 4;
        int y = x + 2;

        for (int i = 0; i < x; i++){
            System.out.print(x + "" + y);
            y = y + i;
        }
    }
}
