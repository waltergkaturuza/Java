import java.util.Scanner;
import java.util.SortedMap;

public class Change_Values {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int firstNum = sc.nextInt();//5
        System.out.println("Enter Second number");
        int secondNum = sc.nextInt();//7
        int temp = 0;
        temp = firstNum;
        firstNum =secondNum;
        secondNum = temp;

        System.out.println("My first number now "+ firstNum);
        System.out.println("My Second number now " + secondNum);
    }
}
