package lab.pkg3_felipelinjarodzuniga;

import java.util.Random;

public class Bares extends Locales {
    
    public Random rand = new Random();
    
    public Bares(String nombre, Empleados Gerente) {
        super(nombre, Gerente);
    }
    
    public void Aleatorio() {
        int random = rand.nextInt(listaP.size());
        
        double precio = listaP.get(random).getPrecio();
        double descuento = precio - (precio * 0.50);
        
        listaP.get(random).setPrecio(descuento);
        
    }
}
