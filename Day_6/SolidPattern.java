public class SolidPattern {
    public static void main(String[] args) {

        int n = 8;

        for(int row = 1; row <= n; row++){
            // for each row -> n columns
            for(int col = 1; col <= n; col++){
                // print star
                System.out.print("* ");
            }
            // move to next line
            System.out.println();
        }
    }
}