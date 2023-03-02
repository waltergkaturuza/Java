import java.util.Scanner;

public class Exam_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you Exam Mark");
        int result = sc.nextInt();

        switch (result){
            case 50:
                System.out.println("You got D Degree");
                break;
            case 60:
                System.out.println("You got C");
                break;
            case 75:
                System.out.println("You got B");
                break;
            case 85:
                System.out.println("You got A");
                break;
            case 90:
                System.out.println("You got Distinction");
        }
    }
}
