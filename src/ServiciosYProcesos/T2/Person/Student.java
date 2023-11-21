package ServiciosYProcesos.T2.Person;

import ServiciosYProcesos.T2.GitHub.Course;

import java.util.Objects;

public class Student extends Person {
    /*
        Modify the Course class to make it abstract. Then create a subclass Student that inherits from Person. The student is identified by the Course he/she attends.
            Create a default constructor and a copy constructor.
            Create a constructor with parameters that initializes every attribute as a String.
            Add getters and setters if needed.
            Re-define the methods toString(), equals() and clone().
     */
    private Course course;

    public Student(String name, String surname, String email, Course course) {
        super(name, surname, email);
        this.course = course;
    }

    public Student() {}

    public Student(Student source) {
        super(source);
        this.course = source.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return super.toString()+"Student{" +
                "course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(course, student.course);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Student(this);
    }
}
