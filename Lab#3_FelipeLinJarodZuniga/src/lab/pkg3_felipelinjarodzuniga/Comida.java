/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_felipelinjarodzuniga;

/**
 *
 * @author Jhon Zuniga
 */
public class Comida extends Productos{
    protected String tipo;
    protected String fecha_venci;

    public Comida() {
    }

    public Comida(String tipo, String fecha_venci) {
        this.tipo = tipo;
        this.fecha_venci = fecha_venci;
    }

    public Comida(String tipo, String fecha_venci, String descripcion, String nombre, double precio) {
        super(descripcion, nombre, precio);
        this.tipo = tipo;
        this.fecha_venci = fecha_venci;
    }

    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFecha_venci() {
        return fecha_venci;
    }

    public void setFecha_venci(String fecha_venci) {
        this.fecha_venci = fecha_venci;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Comida{" + "tipo=" + tipo + ", fecha_venci=" + fecha_venci + '}';
    }

   
    
}
