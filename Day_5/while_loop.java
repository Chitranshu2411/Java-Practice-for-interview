public class while_loop {
    public static void main(String[] args) {
         //while loop
        int i = 1;
        while(i<=5){
            System.out.println(i);
            i++;
        }

        // nested while loop
        int i = 1;
        while (i <= 2) {
            int j = 1; // important reset for each row
            while (j <= 3) {
                System.out.println("i=" + i + ", j=" + j);
                j++;
            }
            i++;
        }
    }
}