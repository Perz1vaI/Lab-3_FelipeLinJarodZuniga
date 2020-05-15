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
public class Ropa extends Productos{
    protected String genero;
    protected String talla;

    public Ropa(String genero, String talla) {
        this.genero = genero;
        this.talla = talla;
    }

    public Ropa(String genero, String talla, String descripcion, String nombre, double precio) {
        super(descripcion, nombre, precio);
        this.genero = genero;
        this.talla = talla;
    }

    public Ropa() {
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
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
        return "Ropa{" + "genero=" + genero + ", talla=" + talla + '}';
    }

   
    
}
