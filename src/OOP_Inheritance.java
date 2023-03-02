public class OOP_Inheritance {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Walter", "Katuruza",33, "Java" );
        programmer.showInfo();
        programmer.work();
        System.out.println("------------------------------------------");

        CEO ceo = new CEO("Baron", "Katuruza", 3, 45);
        ceo.showInfo();
        ceo.work();

        System.out.println("------------------------------------------");


        Driver driver = new Driver("Vhuta", "Paul", 46, 7);
        driver.showInfo();
        driver.work();

        System.out.println("------------------------------------------");

    }
}
