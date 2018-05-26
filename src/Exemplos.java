public class Exemplos {
    public static void main(String[] args) {
        Exemplo01();
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
}
