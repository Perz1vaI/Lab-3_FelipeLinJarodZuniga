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
public class Juguetes extends Productos{
    protected String descri;

    public Juguetes(String descri) {
        this.descri = descri;
    }

    public Juguetes(String descri, String descripcion, String nombre, double precio) {
        super(descripcion, nombre, precio);
        this.descri = descri;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
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
        return "Juguetes{" + "descri=" + descri + '}';
    }
    
    
}
