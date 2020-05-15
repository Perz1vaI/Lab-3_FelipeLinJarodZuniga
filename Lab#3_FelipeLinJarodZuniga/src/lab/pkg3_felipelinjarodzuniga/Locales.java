package lab.pkg3_felipelinjarodzuniga;

import java.util.ArrayList;

public class Locales {

    protected String nombre;
    protected ArrayList<Empleados> listaE = new ArrayList();
    protected ArrayList<Productos> listaP = new ArrayList();
    protected Empleados Gerente;

    public Locales(String nombre, Empleados Gerente) {
        this.nombre = nombre;
        this.Gerente = Gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleados> getListaE() {
        return listaE;
    }

    public void setListaE(ArrayList<Empleados> listaE) {
        this.listaE = listaE;
    }

    public ArrayList<Productos> getListaP() {
        return listaP;
    }

    public void setListaP(ArrayList<Productos> listaP) {
        this.listaP = listaP;
    }

    public Empleados getGerente() {
        return Gerente;
    }

    public void setGerente(Empleados Gerente) {
        this.Gerente = Gerente;
    }

    @Override
    public String toString() {
        return "Locales{" + "nombre=" + nombre + ", listaE=" + listaE + ", listaP=" + listaP + ", Gerente=" + Gerente + '}';
    }

}
