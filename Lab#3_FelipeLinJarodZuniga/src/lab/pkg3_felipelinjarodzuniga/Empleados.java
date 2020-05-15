package lab.pkg3_felipelinjarodzuniga;

public class Empleados extends Personas {

    private String horario;
    private int productos;

    public Empleados(String horario, int productos, int id, String username, String contra, String correo, String nombre, String fecha) {
        super(id, username, contra, correo, nombre, fecha);
        this.horario = horario;
        this.productos = productos;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getProductos() {
        return productos;
    }

    public void setProductos(int productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Personas{" + "id=" + id + ", username=" + username + ", contra=" + contra + ", correo=" + correo + ", nombre=" + nombre + ", fecha=" + fecha + ", horario=" + horario + ", Productos vendidos=" + productos
                + '}';
    }

}
