package Actividades_Ivan_Tema2.Ingles;

import java.util.ArrayList;
import java.util.Objects;

public class AdminCourse extends Course {

    ArrayList<String> documentos;

    @Override
    public void setDuration(int duration) {
        duration = duration+30;
    }

    public AdminCourse(ArrayList<String> documentos) {
        super("nombre","123",450,"Manolo");
        this.documentos = documentos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AdminCourse that = (AdminCourse) o;
        return Objects.equals(documentos, that.documentos);
    }

    @Override
    public String toString() {
        return "AdminCourse{" +
                "documentos=" + documentos +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public ArrayList<String> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(ArrayList<String> documentos) {
        this.documentos = documentos;
    }
}
