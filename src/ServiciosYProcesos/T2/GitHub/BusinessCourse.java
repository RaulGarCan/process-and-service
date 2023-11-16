package Exercise1;

import java.util.Objects;

public class BusinessCourse extends Course{

    private String businessAssociated;
    private int durationPractices;

    public BusinessCourse(String name, String id, int duration, String teacherName, String businessAssociated, int durationPractices) {
        super(name, id, duration, teacherName);
            this.businessAssociated = businessAssociated;


        if (durationPractices>=15){
            this.durationPractices = durationPractices;
        }

    }

    public BusinessCourse(String businessAssociated, int durationPractices) {
        super();
        this.setDuration(30);
        this.businessAssociated = businessAssociated;
        if (durationPractices>=15){
            this.durationPractices = durationPractices;
        }
    }
    public BusinessCourse(BusinessCourse businessCourse){
        super(businessCourse);
        this.businessAssociated=businessCourse.businessAssociated;
        this.durationPractices=businessCourse.durationPractices;
    }

    public String getBusinessAssociated() {
        return businessAssociated;
    }

    public void setBusinessAssociated(String businessAssociated) {
        this.businessAssociated = businessAssociated;
    }

    public int getDurationPractices() {
        return durationPractices;
    }

    public void setDurationPractices(int durationPractices) {
        this.durationPractices = durationPractices;
    }

    @Override
    public String toString() {
        return super.toString()+" BusinessCourse{" +
                "businessAssociated='" + businessAssociated + '\'' +
                ", durationPractices=" + durationPractices +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BusinessCourse that = (BusinessCourse) o;
        return durationPractices == that.durationPractices && Objects.equals(businessAssociated, that.businessAssociated);
    }

    @Override
    protected Course clone() throws CloneNotSupportedException {
        return new BusinessCourse(this);
    }
}
