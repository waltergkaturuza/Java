import java.util.Scanner;

public class IF_ELSE {
    public static void main(String[] args) {
//        if
//        else
//        else if
        Scanner sc  = new Scanner(System.in);
        System.out.println("Please Enter a Number");
        int number = sc.nextInt();

//        int a = 5;
//        if (a>=5){
//            System.out.println("The number is greater than 5");
//        }

        if (number < 50 ){
            System.out.println(" Your number is smaller than 50");
        }else if (number == 50){
            System.out.println("The number is equal to 50");
        }
        else {
            System.out.println("your number is greater 50");
        }





    }
}
