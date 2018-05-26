public class Exemplos {
    public static void main(String[] args) {
        //Exemplo01();
        drawTop();
        drawBox(5,5);
    }
    //começo do exemplo 01
    public static void Exemplo01() {
            writeChars('=', 20);
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            writeChars('>', i);
            writeChars(' ', 20 - 2 * i);
            writeChars('<', i);
            System.out.println();
        }
    }
    public static void writeChars(char ch, int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(ch);
        }
    }
    //fim do exemplo 01
    public static final int SUB_HEIGHT = 5;
    public static void drawTop() {
        for (int line = 1; line <= SUB_HEIGHT; line++) {
            System.out.print("|");
            writeChars(' ', line - 1);
            System.out.print("\\");
            writeChars('.', 2 * SUB_HEIGHT - 2 * line);
            System.out.print("/");
            writeChars(' ', line - 1);
            System.out.println("|");
        }
    }

    //exemplo 3 desenhando um quadrado
    public static void drawBox(int height, int width) {
        // draw top of box
        writeChars('*', width);
        System.out.println();
        // draw middle lines
        for (int i = 1; i <= height - 2; i++) {
            System.out.print('*');
            writeChars(' ', width - 2);
            System.out.println("*");
        }
        // draw bottom of box
        writeChars('*', width);
        System.out.println();
    }
}
