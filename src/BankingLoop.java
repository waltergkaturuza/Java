import java.util.Scanner;

public class BankingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Operation");
        System.out.println("1: Take money");
        System.out.println("2: Put Money to your balance");
        System.out.println("3:Exit");
        int operation = sc.nextInt();
        while (true){
            if (operation ==1){
                System.out.println("Enter balance");
                int balance = sc.nextInt();
                System.out.println("Enter Withdrawal Amount");
                int money = sc.nextInt();
                if (money>balance){
                    System.out.println("Insufficient Funds");
                    break;
                }else{
                    System.out.println("You got your money");
                }
            } else if (operation==2) {
                System.out.println("Enter Your Balance");
                int balance = sc.nextInt();
                System.out.println("Enter amount you depositing");
                int depoit = sc.nextInt();
                System.out.println("You Successfully deposited, your new balance is " +(depoit + balance));
                break;

            }

        }
    }
}
