public class SetterGetterMethd {
    private  String name;
    private String surname;
    private String email;
    private int age;

    public void setName(String name){
        this.name=name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
}
