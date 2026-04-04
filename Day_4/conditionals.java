package Day_5;

public class conditionals {
    public static void main(String[] args) {
//        int dailyPractice = 12;
//
//        if(dailyPractice>=10){
//            System.out.println("Good Consistency!");

        // if-statements
//        int age = 100;
//        if(age>18){
//            System.out.println("you are elegible to vote");

        // if-else statements
//        int score = 45;
//        if(score>=50){
//            System.out.println("pass");
//        } else{
//            System.out.println("fail");
//        }

//        int age = 12;
//        if(age>=18){
//            System.out.println("you can vote");
//        } else {
//            System.out.println("can not vote");
//        }

        //Ternary Operator
        int streakDays = 35;
        String status = (streakDays>=30) ? "Consistent" : "irregular";
        System.out.println(status);
    }
}