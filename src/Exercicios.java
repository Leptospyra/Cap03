import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args){
        //printStrings("abc", 5);
        //MysteryReturn();
        //System.out.println(minimo(4,5,3));
        //System.out.println(countQuarters(2325));
        //subString2();
        //multiby2();
        //printNumbers(5); // Exercicio 01
        //printPowersOf2(10); // Exercicio 02
        //printSquare(3, 7); // Exercicio 04
        //printGrid(4,6); // Exercicio 05
        //System.out.println(largerAbsVal(2,11)); // Exercicio 06
        //System.out.println(largerAbsVal(2,1,-5)); // Exercicio 06
        //padString("Congratulations!", 8); //Exercicio 11
        //vertical("hey now"); // Exercicio 12
        //printReverse("9876543210"); Exercicio 13
        //inputBirthday(); //Exercicio 14
        processName();//Exercicio 15
    }
    public static void printStrings(String nome, int repeticoes){
        for (int i = 1; i<=repeticoes; i++){
            System.out.print(nome + " ");
        }
    }


    public static void MysteryReturn() {
        int x = 1, y = 2, z = 3;
        z = mystery(x, z, y);
        System.out.println(x + " " + y + " " + z);
        x = mystery(z, z, x);
        System.out.println(x + " " + y + " " + z);
        y = mystery(y, y, z);
        System.out.println(x + " " + y + " " + z);
    }

     public static int mystery(int z, int x, int y) {
        z--;
        x = 2 * y + z;
        y = x - 1;
        System.out.println(y + " " + z);
        return x;
     }

     public static int minimo(int n1, int n2, int n3) {
        return Math.min(n1, Math.min(n2, n3));
     }

    public static int countQuarters(int n1) {
        int resto = n1%100;
        return (resto/25);
    }

    public static void subString() {
        String quote = "Four score and seven years ago";
        quote = quote.toUpperCase();
        System.out.println(quote.substring(5, 10));
    }

    public static void subString2() {
        String quote = "Four score and seven years ago";
        System.out.println(quote.substring(0, 4) + quote.substring(20, 26));
    }

    public static void multiby2() {
        Scanner console = new Scanner(System.in);
        System.out.print("Digite um numero");
        int valor = console.nextInt();
        System.out.print(valor + " X 2 = " + (valor * 2));
    }
    public static void printNumbers(int n1) {
        for (int i = 1; i <= n1; i++) {
            System.out.print("[" + i + "] ");
        }
    }

    public static void printPowersOf2(int n1) {
        for (int i = 0; i <= n1; i++) {
            System.out.print((int)Math.pow(2, i)+ " ");
        }
    }
    public static void printSquare(int minimo, int maximo) {
        int inicio = minimo;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(inicio);
                inicio++;
                if (inicio == maximo + 1){
                    inicio = minimo;
                }
            }
            System.out.println();
            inicio = minimo + i;
        }
    }

    public static void printGrid(int row, int col) {
        int valor = 0;
        for (int i = 1; i <= row; i++) {
            valor = i;
            for (int j = 1; j <= col; j++) {
                System.out.print(valor + " ");
                valor += row;
            }
            System.out.println();

        }
    }

    public static int largerAbsVal(int n1, int n2) {
        n1 = Math.abs(n1);
        n2 = Math.abs(n2);
        return Math.max(n1,n2);
    }
    public static int largerAbsVal(int n1, int n2, int n3) {
        n1 = Math.abs(n1);
        n2 = Math.abs(n2);
        n3 = Math.abs(n3);
        return Math.max(n1, Math.max(n2, n3));
    }

    public static void padString(String text, int spaces) { // Exercicio 11
        System.out.print("\"");
        for (int i = 0; i <= (spaces - text.length()+1); i++) {
            text = (text + " ");
        }
        System.out.print(text + "\"");
    }

    public static void vertical(String text) { // Exercicio 12
        for (int i = 0; i < (text.length()); i++) {
            System.out.println(text.charAt(i));
        }
    }

    public static void printReverse(String text) { // Exercicio 13
        for (int i = (text.length()); i > 0; i--) {
            System.out.print(text.charAt(i-1));
        }
    }

    public static void inputBirthday() { // Exercicio 14
        Scanner console = new Scanner(System.in);
        System.out.print("On what day of the month were you born?");
        int nDay = console.nextInt();
        System.out.print("What is the name of the month in which you were born?");
        String nameMonth = console.nextLine();
        System.out.print("During what year were you born?");
        int NYear = console.nextInt();
        System.out.print("You were born on " + nameMonth + " " + nDay + ", " + NYear +". ");
        System.out.print("You’re mighty old!");
    }

    public static void processName() { // Exercicio 14 como faço para separar os tokens
        Scanner console = new Scanner(System.in);
        System.out.print("What is your name?");
        String text = console.nextLine();
    }
}