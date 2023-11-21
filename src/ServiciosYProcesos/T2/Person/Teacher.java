package ServiciosYProcesos.T2.Person;

import ServiciosYProcesos.T2.GitHub.Course;

import java.util.ArrayList;
import java.util.Objects;

public class Teacher extends Person {
    /*
    Create a subclass Teacher that inherits from Person. The Teacher is identified by the Course he/she teaches, and by a collection of students from that course.
        Create a default constructor and a copy constructor.
        Create a constructor with parameters that initializes every attribute as a String.
        Add getters and setters if needed.
        Re-define the methods toString(), equals() and clone().

     */
    private Course course;
    private ArrayList<Student> students;

    public Teacher(String name, String surname, String email, Course course, ArrayList<Student> students) {
        super(name, surname, email);
        this.course = course;
        this.students = students;
    }
    public Teacher(){}
    public Teacher(Teacher source){
        super(source);
        this.course= source.course;
        for(Student s : source.students){
            this.students.add(new Student(s));
        }
    }

    public Course getCourse() {
        return course;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setStudents(ArrayList<Student> students) {
        for(Student s : students){
            this.students.add(new Student(s));
        }
    }

    @Override
    public String toString() {
        return super.toString()+"Teacher{" +
                "course=" + course +
                ", students=" + students +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(course, teacher.course) && Objects.equals(students, teacher.students);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Teacher(this);
    }
}
