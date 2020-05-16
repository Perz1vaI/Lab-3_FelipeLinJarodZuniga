package lab.pkg3_felipelinjarodzuniga;

import java.util.ArrayList;

public class Locales {

    protected String nombre;
    protected ArrayList<Personas> listaE = new ArrayList();
    protected ArrayList<Productos> listaP = new ArrayList();
    protected Personas Gerente;

    public Locales(String nombre, Personas Gerente) {
        this.nombre = nombre;
        this.Gerente = Gerente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Personas> getListaE() {
        return listaE;
    }

    public void setListaE(ArrayList<Personas> listaE) {
        this.listaE = listaE;
    }

    public ArrayList<Productos> getListaP() {
        return listaP;
    }

    public void setListaP(ArrayList<Productos> listaP) {
        this.listaP = listaP;
    }

    public Personas getGerente() {
        return Gerente;
    }

    public void setGerente(Personas Gerente) {
        this.Gerente = Gerente;
    }

    @Override
    public String toString() {
        return "Locales{" + "nombre=" + nombre + ", listaE=" + listaE + ", listaP=" + listaP + ", Gerente=" + Gerente + '}';
    }

}
