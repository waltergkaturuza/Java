public class HumanStaticClass {
    private static String name;
    private static int pounds;

    public static  class Brain2{
        public String brainName2(){
            return name;
        }
    }
    public  static  class Heart2{
        public int heartPounds(){
            return pounds;

        }
    }
}
