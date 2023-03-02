import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {
        String s = "  Hello  ";
        System.out.println(s);
        String another = "hello";

        String b = "walter";
        if(s.equals(another)){
            System.out.println("Yes those are equal and same");
        }else {
            System.out.println("These two are not the same");
        }
        //removing empty spaces
        s=s.trim();
        System.out.println("Here we trimmed s to" +s);

        //length method
        s.length();

        System.out.println(s.length());


        //isEmpty method
        System.out.println(another.isEmpty());
        boolean c = b.isEmpty();
        System.out.println("This is c "+ c);
        boolean d = b.isBlank();
        System.out.println("This is d " + d);

        b = b.toUpperCase();
        System.out.println(b);



    }
}
