public class ProgramsProjectCap03 {
    public static void main (String[] args){
        Program01(5, 3);
        Program02();
    }

    public static void Program01(int altura, int segmentos) {
        for (int seg = 1; seg <= segmentos; seg++){
            for (int line = seg; line <= (altura+seg-1) ; line++) {
                for (int i = altura - line ; i >= 0; i--) {
                    System.out.print(" ");
                }

                for (int i = 1; i <= ((line) * 2 - 1); i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    

}
