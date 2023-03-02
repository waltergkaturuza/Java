public class Driver extends OOPEmployInheritance {
    private int cars;
    public Driver(String name, String surname, int age, int cars) {
        super(name, surname, age);
        this.cars = cars;
    }

    @Override
    public void work() {
        super.work();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Cars: " + cars);
    }
}
