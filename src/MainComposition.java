public class MainComposition {
    //a Car has engine
    //a Car has wheel
    //Program is a Employee

    // Composition is "HAs a connection"
    //AUDI, doors, wheels, seats, engine
    // Is a inheritance is a connection
    //Has a

    public static void main(String[] args) {
        Engine engine = new Engine("MM",450, "SSL");
        Wheel wheel = new Wheel("Dunlop","Black",23);
        Cars cars = new Cars("Audi",4,5,engine,wheel);
        System.out.println(cars.getName());
        System.out.println(cars.getSeats());
        System.out.println(engine.getName());
        System.out.println(engine.getModel());
    }
}
