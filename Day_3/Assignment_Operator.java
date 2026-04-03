public class Assignment_Operator {
    public static void main(String[] args) {

        int ratingPoints = 100;

        ratingPoints += 20; //ratingPoints = ratingPoints + 20 ;
        System.out.println(ratingPoints); //100+20

        ratingPoints -= 10; //ratingPoints = ratingPoints + 10 ;
        System.out.println(ratingPoints); //120-10

        ratingPoints *= 2; //ratingPoints = ratingPoints + 2
        System.out.println(ratingPoints); //110*2

        ratingPoints /= 4; //ratingPoints = ratingPoints + 4 ;
        System.out.println(ratingPoints); //220/4

        ratingPoints %= 30; //ratingPoints = ratingPoints + 30 ;
        System.out.println(ratingPoints); //55%30
    }
}