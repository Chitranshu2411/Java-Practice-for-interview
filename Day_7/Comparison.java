import javax.net.ssl.SSLContext;

public class Comparison {
    public static void main(String[] args) {
        String a = "Chitranshu";
        String b = "Chitranshu";
        // ==
        //System.out.println(a==b); // true

        String name1 = new String("Yadav");
        String name2 = new String("Yadav");
        //System.out.println(name1 == name2); // false
        //System.out.println(name1.equals(name2)); //true
        //System.out.println(name1.charAt(0)); //Print Y
    }
}