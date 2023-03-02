import java.util.Scanner;

public class Scanner_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a First Number");
        int a  = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        System.out.println("Our User Wrote this number " + a);
        System.out.println("you entered two numbers and the total of them is: " + (a+b));
    }
}

