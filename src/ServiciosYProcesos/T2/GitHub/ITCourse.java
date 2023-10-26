package ServiciosYProcesos.T2.GitHub;

public class ITCourse extends Course {
    /*
        The ITCourse has a specialization that can be either Networking (35h),
        Programming (50h) and Sysadmin (40h).
     */
    private Specialization specialization;
    enum Specialization{
        NETWORKING(35),
        PROGRAMMING(50),
        SYSADMIN(40);
        private int duration;
        Specialization(int duration){
            this.duration=duration;
        }
    }
    public ITCourse(ITCourse source){
        setDuration(source.getDuration());
        specialization = source.specialization;
        setId();
        setName(source.getName());
        setTeacher(source.getTeacher());
    }
    public ITCourse(){}
    public ITCourse(String name, String teacher, Specialization specialization){
        setDuration(specialization.duration);
        setId();
        setName(name);
        setTeacher(teacher);
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return super.toString()+"ITCourse{" +
                "specialization=" + specialization +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new ITCourse(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ITCourse itCourse = (ITCourse) o;
        return specialization == itCourse.specialization;
    }
}
