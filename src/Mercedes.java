public class Mercedes extends Vehicle{
    @Override
    public void run(){
        System.out.println("Mercedes is working");
    }
    public void stop(){
        System.out.println("Mercedes stopped");
    }
    //you cannot use multiple extends
}
