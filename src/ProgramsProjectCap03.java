public class ProgramsProjectCap03 {
    public static void main (String[] args){
        programa1();
    }
    public static void programa1() {
        for (int i = 6; i >= 1; i--) {
            //Asteriscos a esquerda
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
            //espaços a Esquerda
            for (int espacos = 6; espacos >= i; espacos--) {
                System.out.print(" ");
            }
            //barras a esquerda
            for (int j = 1; j <= i*2; j++) {
                System.out.print("/");
            }
            System.out.print(" ");
            //barras a direita
            for (int j = 12; j >= (i * 2) - 1; j--) {
                System.out.print("\\");
            }
            System.out.print(" ");
            //espaços a direita
            for (int espacos = 6; espacos >= i; espacos--) {
                System.out.print(" ");
            }
            //Asteriscos a direita
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
