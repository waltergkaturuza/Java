public class AbstractMain {
    public static void main(String[] args) {
        PersonAbstract personAbstract = new PersonAbstract();
        personAbstract.increment();
        String s = personAbstract.sayName();
        System.out.println(s);

    }
}
