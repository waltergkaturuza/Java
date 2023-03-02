public class Audi extends Vehicle {
    //Audi pretend itself like vehicle object
    @Override
    public void run(){
        System.out.println("Audi is working");
    }
//@Override static method cannot override
    public void stop(){
        System.out.println("Audi stopped");
    }
    public static  void stop2(){
        System.out.println("Audi Static method");
    }
    //@Override Note you cannot override private method even if its nonstatic
    private  void stop3(){
        System.out.println("Audi class private method non static");
    }
}
