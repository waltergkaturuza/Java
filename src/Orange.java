import org.w3c.dom.ls.LSOutput;

public class Orange {

    public static int divide(int a, int b) {
        //return type
        return a/b;

    }
    public static int twoTimesDivide(){
        int b = 2;
        int a =100;
        return (divide(a, b)/2);
    }
    //void is no returnable
    //int, String, double, all of these are returnable
    //system.out.println()---> means you cannot reuse the output,
    //but return is used instead
    public static int plus(int c, int d) {
        return c+d;

    }
    public static int plusAgain(){
        int c = 15;
        int d = 5;
        return 10 + (plus(c,d));

    }
}
