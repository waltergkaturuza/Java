public class PublicPrivateModifiers {
    public static void main(String[] args) {

        //private is access modifier
        //Student st=new Student();
//        st.name = "Job";
//        st.surname= "NIce";
 SetterGetterMethd st1= new SetterGetterMethd();
 st1.setName("Walter");
 st1.setSurname("Katuruza");
String name=  st1.getName();
 String surname =st1.getSurname();

        System.out.println(name);
        System.out.println(surname);

    }
}
