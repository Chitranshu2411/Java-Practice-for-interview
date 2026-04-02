public class DataTypes {
    public static void main(String[] args) {

        //numeric datatypes - short , byte , int , long 
        byte num1 = 127;
        System.out.println(num1);
        short num2 = 32767;
        System.out.println(num2);
        int num3 = 50000;
        long num4 = 566754453;
        System.out.println(num3);
        System.out.println(num4);

        //floating datatypes
        float num5 = 3.142436f;
        System.out.println(num5);

        double num6 = 3.1435346757099099;
        System.out.println(num6);

        //other - Char, Boolean
        boolean eligibleVote = true;
        System.out.println(eligibleVote);

        char firstCharacter = 'a';
        System.out.println("my first character is : " + firstCharacter);
        System.out.println("my first character is : " + (char) (firstCharacter+2));

    }
}