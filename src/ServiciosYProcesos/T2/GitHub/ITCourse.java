package Exercise1;

import java.util.Objects;

public class ITCourse extends Course {

    private TypeSpecialization typeSpecialization;


    public ITCourse(String name, String id, int duration, String teacherName, TypeSpecialization typeSpecialization) {
        super(name, id, duration, teacherName);
        switch (typeSpecialization){
            case NETWORKING -> this.setDuration(35);
            case PROGRAMMING -> this.setDuration(50);
            case SYSADMIN -> this.setDuration(40);
        }
        this.typeSpecialization = typeSpecialization;
    }

    public ITCourse(TypeSpecialization typeSpecialization) {
        super();
        this.typeSpecialization = typeSpecialization;
    }
    public ITCourse(ITCourse itCourse){
        super(itCourse);
        this.typeSpecialization=itCourse.typeSpecialization;
    }

    public TypeSpecialization getTypeSpecialization() {
        return typeSpecialization;
    }

    public void setTypeSpecialization(TypeSpecialization typeSpecialization) {
        this.typeSpecialization = typeSpecialization;
    }

    @Override
    public String toString() {
        return super.toString() + " ITCourse{" +
                "typeSpecialization=" + typeSpecialization +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ITCourse itCourse = (ITCourse) o;
        return typeSpecialization == itCourse.typeSpecialization;
    }

    @Override
    protected Course clone() throws CloneNotSupportedException {
       return new ITCourse(this);

    }


}
