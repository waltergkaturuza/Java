import java.util.SplittableRandom;

public class Programmer extends OOPEmployInheritance {
    private String language;
    public Programmer(String name, String surname, int age, String language){

        super(name, surname, age);
        //super() go and call constructor of the super class
        //super.// means go and call variable of the supper class
        this.language = language;
    }
//override go and call a method from super class and write something over it

    @Override // annotation
    public void work() {
        super.work();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("language: " + language);
    }
}
