package Day_8;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibbonacci(7));
    }
    static int fibbonacci (int n){
        //base condition
        if ( n< 2){
            return n;
        }
        return fibbonacci(n-1) + fibbonacci(n-2);
    }
}