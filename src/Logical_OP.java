import java.util.Scanner;

public class Logical_OP {
    public static void main(String[] args) {
//        && and
//        != not
//        || or
//adult definer program
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your first Mark: ");
        int firstResult = sc.nextInt();
        System.out.println("Enter your Second mark: ");
        int secondResult = sc.nextInt();

        if (firstResult >50 && secondResult> 50){
            System.out.println("You Get College Degree");
        }else {
            System.out.println("You wont get a degree");
        }

        }
        //int  age = sc.nextInt();

        //int number = sc.nextInt();
//        if (number !=5){
//            System.out.println("the number is not 5, the number is " + number);
//        }else if (number ==5) {
//            System.out.println("the number is 5");
//        }


//        if (age >18 && age <58){
//            System.out.println("You an Adult");
//        }else if (age < 18){
//            System.out.println("You not adult");
//        }
//    }
}
