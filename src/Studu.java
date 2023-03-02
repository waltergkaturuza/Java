public class Studu extends Human{
   //variables are called states
    private String name;
    private  String surname;

    public Studu(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
//my methods are called behaviours
    public  void walk(String name){
        System.out.println(name);
    }



}
