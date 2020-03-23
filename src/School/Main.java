package School;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setAge(30);
        teacher.setSubject("ОБЖ");

        Student student = new Student();
        student.setAge(7);
        student.setSubject("ОБЖ");

        Student student1 = new Student();
        student1.setAge(8);
        student1.setSubject("Химия");

        Director director = new Director();
        director.setAge(40);

        School schoolName = new School("ИТМО", director);
        schoolName.addStudent(student);
        schoolName.addStudent(student1);
        schoolName.addTeacher(teacher);
        schoolName.schoolDay();

    }
}
