public class InnerClassMain {
    public static void main(String[] args) {
        HumanStaticClass.Brain2 brain2= new HumanStaticClass.Brain2();
        HumanStaticClass.Heart2 heart2= new HumanStaticClass.Heart2();

        System.out.println(brain2.brainName2());
        System.out.println(heart2.heartPounds());
    }
}
