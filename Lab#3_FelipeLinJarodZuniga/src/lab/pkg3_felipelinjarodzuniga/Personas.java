package lab.pkg3_felipelinjarodzuniga;

public class Personas {

    protected String id;
    protected String username;
    protected String contra;
    protected String correo;
    protected String nombre;
    protected String fecha;

    public Personas(String id, String username, String contra, String correo, String nombre, String fecha) {
        this.id = id;
        this.username = username;
        this.contra = contra;
        this.correo = correo;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Personas{" + "id=" + id + ", username=" + username + ", contra=" + contra + ", correo=" + correo + ", nombre=" + nombre + ", fecha=" + fecha + '}';
    }

}
