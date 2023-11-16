package Exercise1;

import java.util.ArrayList;
import java.util.Objects;

public class AdminCourse extends Course{
    ArrayList<String> documents;


    public AdminCourse(String name, String id, int duration, String teacherName, ArrayList<String> documents) {
        super(name, id, duration, teacherName);
        this.documents = documents;
    }

    public AdminCourse(ArrayList<String> documents) {
        super();
        this.setDuration(40);
        this.documents = documents;
    }
    public AdminCourse(AdminCourse adminCourse){
        super(adminCourse);
        this.documents=adminCourse.documents;

    }

    public ArrayList<String> getDocuments() {
        return documents;
    }

    public void setDocuments(ArrayList<String> documents) {
        this.documents = documents;
    }

    @Override
    public String toString() {
        return super.toString()+ " AdminCourse{" +
                "documents=" + documents +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AdminCourse that = (AdminCourse) o;
        return Objects.equals(documents, that.documents);
    }
    @Override
    protected Course clone() throws CloneNotSupportedException {
        return new AdminCourse(this);
    }

}
