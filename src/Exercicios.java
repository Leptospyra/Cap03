import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args){
        //printStrings("abc", 5);
        //MysteryReturn();
        //System.out.println(minimo(4,5,3));
        //System.out.println(countQuarters(2325));
        //subString2();
        multiby2();
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
}