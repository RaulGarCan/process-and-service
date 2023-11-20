package Actividades_Ivan_Tema2.Ingles;

public enum Specialization {

    Networking(35),
    Programming(50),
    Sysadmin(40);

    private final int horas;


    Specialization(int horas) {
        this.horas = horas;
    }


    public int getHoras() {
        return horas;
    }

    @Override
    public String toString() {
        return "Specialization{" +
                "horas=" + horas +
                '}';
    }







}
