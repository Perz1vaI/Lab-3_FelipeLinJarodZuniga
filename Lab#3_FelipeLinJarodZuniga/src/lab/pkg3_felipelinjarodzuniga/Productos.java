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
public class Productos {
    protected String descripcion;
    protected String nombre;
    protected double precio;

    public Productos() {
    }

    public Productos(String descripcion, String nombre, double precio) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.precio = precio;
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
        return "Productos{" + "descripcion=" + descripcion + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
    
}
