import java.util.ArrayList;

public class Course {
    private String subject;
    private String teacher;
    private ArrayList<Student> enrolledStudents;

    public String getSubject(){
        return subject;
    }

    public String getTeacher() {
        return teacher;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

//    public void setEnrolledStudents(enrolledStudents) {
//        this.enrolledStudents = enrolledStudents;
//    }

    public void addStudents(Student student) {
        enrolledStudents.add(student);
    }
}
