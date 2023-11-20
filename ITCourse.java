package Actividades_Ivan_Tema2.Ingles;

import java.util.Objects;

public class ITCourse extends Course {

    Specialization specialization;

    public ITCourse(Specialization specialization) {
        super("HolaCourse","11234",500,"MaríaOfThe O");
        this.specialization = specialization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ITCourse itCourse = (ITCourse) o;
        return specialization == itCourse.specialization;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
            return super.clone();
    }

    @Override
    public String toString() {
        return "ITCourse{" +
                "specialization=" + specialization +
                '}';
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }
}
