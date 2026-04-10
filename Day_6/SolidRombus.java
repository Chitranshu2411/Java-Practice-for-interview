public class SolidRombus {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            //for each row -> spaces , stars

            //space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            //move to next line
            System.out.println();
        }
    }
}