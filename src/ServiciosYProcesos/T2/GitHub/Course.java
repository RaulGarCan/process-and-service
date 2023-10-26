package ServiciosYProcesos.T2.GitHub;

import java.util.Objects;

public class Course {
    /*
        Create a class to represent an online Course. Each course has a name, an ID, a duration and a teacher.
        Consider these restrictions and add the following functionalities:

            The name of the Course has, at least, 4 letters.
            The teacher is stored with their name separated with a comma from their surnames.
            The ID starts with the first letter of the course, and ends with the first letter of the teacher’s name.
            Each course lasts for at least 30 hours.
            Don’t add any constructor to this class.
            Add getters and setters for each attribute.
            Implement the methods toString(), clone(), and equals(Course).
     */
    private String name;
    private String teacher;
    private String id;
    private int duration;

    public void setId() {
        this.id = ""+name.charAt(0)+teacher.charAt(0);
    }

    public void setName(String name) {
        if(name.length()<4){
            return;
        }
        this.name = name;
    }

    public void setDuration(int duration) {
        if(duration<30){
            return;
        }
        this.duration = duration;
    }

    public void setTeacher(String teacher) {
        String[] tmp = teacher.split(" ");
        teacher="";
        for(int i=0; i<tmp.length; i++){
            teacher+=tmp[i];
            if(i==0){ // Coloca una coma tras el nombre
                teacher+=",";
            }
        }
        this.teacher = teacher;
    }

    public int getDuration() {
        return duration;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                ", id='" + id + '\'' +
                ", duration=" + duration +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return duration == course.duration && Objects.equals(name, course.name) && Objects.equals(teacher, course.teacher) && Objects.equals(id, course.id);
    }

}
