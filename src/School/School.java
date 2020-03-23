package School;

public class School {
    private final String schoolName; // задали имя его нельязя поменять
    private Director director;

    private Student[] students = new Student[3];
    private Teacher[] teachers = new Teacher[5];

    public School(String schoolName, Director director) {
        this.schoolName = schoolName;
        this.director = director;
    }
    public void schoolDay () {
        director.beginLessons();
        for (Teacher teacher: teachers) {
            if (teacher != null) {
                for (Student student : students) {
                    if (student != null) {
                        if (teacher.getSubject().equals(student.getSubject())) {
                            teacher.teach(student);
                        }
                    }
                }
            }
        }
        director.endLessons();
    }
    public void addTeacher(Teacher teacher){
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null) {
                teachers[i] = teacher;
            }

        }
    }
    public void addStudent(Student student){
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
            }
        }
    }

}
