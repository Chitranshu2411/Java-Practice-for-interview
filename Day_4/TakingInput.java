package Day_5;

import java.math.BigInteger;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        // int a  = 5;
        // int b = 1;
        //System.out.println(a+b);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for firstNum:");
        int firstNum = sc.nextInt();
        System.out.println("Enter the value for secondNum:");
        int secondNum = sc.nextInt();
        int ans = firstNum + secondNum;
        System.out.println("Answer is :" + ans);

        BigInteger bg = sc.nextBigInteger();
        System.out.println("BigInteger:" + bg);

        System.out.println("Enter the value for flag:");
        boolean flag = sc.nextBoolean();
        System.out.println("Enter the value for shortValue:");
        short shortVal = sc.nextShort();
        System.out.println("Enter the value for floatValue:");
        float floatVal = sc.nextFloat();

        System.out.println("flag is :" + flag);
        System.out.println("shortVal is :" + shortVal);
        System.out.println("floatVal is :" + floatVal);
    }
}