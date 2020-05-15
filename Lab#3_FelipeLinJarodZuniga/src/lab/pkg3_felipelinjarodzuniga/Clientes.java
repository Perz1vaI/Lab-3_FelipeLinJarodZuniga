package lab.pkg3_felipelinjarodzuniga;

import java.util.ArrayList;

public class Clientes extends Personas {

    private int dinero;
    private ArrayList compras;

    public Clientes(int dinero, ArrayList compras, int id, String username, String contra, String correo, String nombre, String fecha) {
        super(id, username, contra, correo, nombre, fecha);
        this.dinero = dinero;
        this.compras = compras;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList getCompras() {
        return compras;
    }

    public void setCompras(ArrayList compras) {
        this.compras = compras;
    }

    @Override
    public String toString() {
        return "Personas{" + "id=" + id + ", username=" + username + ", contra=" + contra + ", correo=" + correo + ", nombre=" + nombre + ", fecha=" + fecha + ", Dinero=" + dinero + ", Lista de compra=" + compras
                + '}';
    }

}
