public class PersonAbstract extends AbstractClasses{
    @Override
    int increment() {
        System.out.println("I incremented 5");
        return 5;
    }

    @Override
    String sayName() {
        return "CodesTech";
    }
}
