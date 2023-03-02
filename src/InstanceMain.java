public class InstanceMain {
    public static void main(String[] args) {
//Instanceof is used to compare

        PersonInstance personInstance = new PersonInstance();
        StudentInstant  studentInstant  = new StudentInstant();
        TeacherInstant teacherInstant = new TeacherInstant();

        System.out.println(teacherInstant instanceof PersonInstance);

    }
}
