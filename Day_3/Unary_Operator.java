public class Unary_Operator {
    public static void main(String[] args) {
        int activeUsers = 100;

        int prefix = ++activeUsers;
        //pehle activeUser increment hua and bngya -> 101
        //fir prefix me copy hua, sp prefix ki value -> 101
        int postfix = activeUsers++;
        //activeUsers = 101
        //pehle use krte hai , postfix me copy hoke , postfix ->101
        //uske baad increment krdia , activeUsers -> 102

        System.out.println(prefix);
        //101
        System.out.println(postfix);
        //101
        System.out.println(activeUsers);
        //102
    }
}