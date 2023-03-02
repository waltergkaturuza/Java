public class MainInnerLocal {
    //define it without public
    //define it non static
    //local inner clss pretends like variables

    public static void main(String[] args) {

        class A{
            //local inner class
            public void shutdown(){
                System.out.println("Class A shutdowm");
            }
        }
        A a = new A();
        a.shutdown();
    }
}
