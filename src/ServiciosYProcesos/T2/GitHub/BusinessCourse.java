package ServiciosYProcesos.T2.GitHub;

import java.util.Objects;

public class BusinessCourse extends Course {
    /*
        The BusinessCourse makes its students go to an associated business
        on an internship. These Course has a duration of 30h with an
        internship that lasts for at least 15 hours
     */
    private String associatedBusiness;
    private int internship;
    public BusinessCourse(BusinessCourse source){
        this.internship=source.internship;
        setDuration(source.getDuration());
        associatedBusiness=source.associatedBusiness;
        setName(source.getName());
        setTeacher(source.getTeacher());
        setId();
    }
    public BusinessCourse(){}
    public BusinessCourse(int internship, String name, String teacher, String associatedBusiness){
        this.internship=internship;
        setDuration(30+internship);
        setName(name);
        setTeacher(teacher);
        this.associatedBusiness=associatedBusiness;
        setId();
    }

    @Override
    public String toString() {
        return super.toString()+"BusinessCourse{" +
                "associatedBusiness='" + associatedBusiness + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new BusinessCourse(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BusinessCourse that = (BusinessCourse) o;
        return Objects.equals(associatedBusiness, that.associatedBusiness);
    }
}
