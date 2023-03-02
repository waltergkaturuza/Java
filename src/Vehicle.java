public class Vehicle {

public void run(){
    System.out.println("Car is working");
}
public void stop(){
    System.out.println("Vehicle stopped");
}
private static void stop2(){
    System.out.println("Car class private method");
}
    private void stop3(){
        System.out.println("Car class private method non static");
    }
}
