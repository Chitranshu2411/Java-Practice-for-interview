public class nested_loop {
    public static void main(String[] args) {
        for ( int i = 1; i<=3; i++){  //rows
            for ( int j = 1; j<=3; j++){   //columns
                System.out.print("* ");
            }
            System.out.println(); //move to next line
        }

        for ( int i = 1; i<=10; i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }

        for ( int i = 1; i<=10; i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}