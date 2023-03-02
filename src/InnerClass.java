public class InnerClass {
    public static void main(String[] args) {
       HumanInnerClasNonStatic humanInnerClas = new HumanInnerClasNonStatic();
      HumanInnerClasNonStatic.Heart heart = new HumanInnerClasNonStatic().new Heart();
      HumanInnerClasNonStatic.Brain brain =new HumanInnerClasNonStatic().new Brain();


        System.out.println(brain.brainName());
        System.out.println(heart.heartName());
    }
    //Non Static inner classes

}
