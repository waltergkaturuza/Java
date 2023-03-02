import java.util.Scanner;

public class RegApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "SS Academy";
        String password = "12345";
        int pass = 3;

    while (true) {
        System.out.println("Please Enter your name");
        String nameInput = sc.nextLine();
        System.out.println("Please Enter your Password");
        String passwordInput = sc.nextLine();
        if (name.equals(nameInput) && password.equals(passwordInput)) {
            System.out.println("Successifully login");
            System.out.println("Welcome");
            break;

        } else if (!name.equals(nameInput) && password.equals(passwordInput)) {
            System.out.println("You entered your name false");
            pass -=1;
            System.out.println("You left with "+ pass+ " chances");

        } else if (name.equals(nameInput) && (!password.equals(passwordInput))) {
            System.out.println("Password Incorrect!");
            pass -=1;
            System.out.println("You left with "+ pass+ " chances");

        } else if((!name.equals(nameInput))&& !(password.equals(passwordInput))){
            System.out.println("Wrong Credentials, check your username and password");
            pass-=1;
            System.out.println("You left with "+ pass+ " chances");
        }if (pass==0){

            System.out.println("Your number of login attempts required exhausted, account blocked");
            break;
        }
    }
    }
}
