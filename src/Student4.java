public class Student4 extends Person_Inheritance{

    //extends
    //super class is base class that we extends
    //person is our super class / base class /parent class
    //student or teacher is our child class

    public Student4(String name, String surname, int age){
        super(name,surname,age); //go and call constructor of our superclass
    }
    public static  void run(){
        System.out.println("Student is running");
    }

    public String read(String bookName) {
        return bookName;

    }
}
