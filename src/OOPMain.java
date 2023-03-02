 class OOPMain {
    public static void main(String[] args) {
        //classes is like fabrics , we sue them to create objects
        //created in Mercedes (class) S class 600 (object)

        //Apple school = new Apple();
        //school is our reference
        //new is our key word that we use to create objects
        Student myStudent = new Student();
        myStudent.age = 16;
        //myStudent.email = "waltergkaturuza@gamil.com";
        myStudent.surname = "Katuruza";
        myStudent.name = "Walter";

        Student secondStudent = new Student();
        secondStudent.name= "Patricia";
        secondStudent.surname= "Mugaviri";
       // secondStudent.email = "pmugaviri@gamil.com";
        secondStudent.age = 24;
    }
}
