package ServiciosYProcesos.T2.GitHub;

import java.util.ArrayList;
import java.util.Objects;

public class AdminCourse extends Course {
    /*
        The AdminCourse has a group of documents associated to manage,
        each identified with a name. The Course has a duration of 40h.
     */
    private ArrayList<String> documents;
    public AdminCourse(){}
    public AdminCourse(String[] documents, String name, String teacher){
        setDuration(40);
        this.documents = new ArrayList<>();
        for(String s : documents){
            this.documents.add(s);
        }
        setName(name);
        setTeacher(teacher);
        setId();
    }
    public AdminCourse(AdminCourse source){
        setDuration(source.getDuration());
        setName(source.getName());
        setTeacher(source.getTeacher());
        this.documents=source.documents;
        setId();
    }

    @Override
    public String toString() {
        return super.toString()+"AdminCourse{" +
                "documents=" + documents +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new AdminCourse(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AdminCourse that = (AdminCourse) o;
        return Objects.equals(documents, that.documents);
    }
}
