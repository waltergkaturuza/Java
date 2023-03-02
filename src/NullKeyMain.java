public class NullKeyMain {
    public static void main(String[] args) {
        String s0 ="ABC";
        String s = "";
        String s1 = null;
        String s2; //undefined

        System.out.println(getup());
        System.out.println(pushup());

        if (s==s1){
            System.out.println("they are same");
        }else {
            System.out.println("they are not equal");
        }

    }
    public String read(){
        return "Book";
    }
    public static String getup(){
        return null;
    }
    public static int pushup(){
        return 0;
    }
}
