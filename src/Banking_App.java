import java.sql.SQLOutput;
import java.util.Scanner;

public class Banking_App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome Banking Application");
        System.out.println("Our Operations");
        System.out.println("Click 1 to exit from the system");
        System.out.println("Click 2 for money transfer");
        System.out.println("Click 3 to get Money");

        int operation = sc.nextInt();

        if (operation==1){
            System.out.println("Exiting From the System, GoodBye!");

        } else if (operation==2) {
            System.out.println("How Much money do you have");
            int balance = sc.nextInt();
            System.out.println("How Much money you want to transfer");
            int transfer = sc.nextInt();
            if (balance<transfer){
                System.out.println("Funds Transfer Failed, No Enough Funds!");
            } else if (balance>transfer || balance == transfer) {
                System.out.println("You Transferred your Money Successfully");
                System.out.println("New Balance is "+ (balance-transfer));
                System.out.println("Thank you for banking with us!");
            }

        } else if (operation==3) {
            System.out.println("Enter your balance");
            int balance = sc.nextInt();
            System.out.println("Enter the amount you want to withdraw");
            int money = sc.nextInt();
            if (balance<money){
                System.out.println("Sorry you have insufficient Funds");
            } else if (balance>money) {
                System.out.println(money +" Dollars withdrawal successful");
                System.out.println("your new balance "+ (balance-money));
            }

        } else{
            System.out.println("Invalid Operation");
        }


    }
}
