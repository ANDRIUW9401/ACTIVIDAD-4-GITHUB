
package ANIMALES;


import java.util.ArrayList;
import java.util.List;


public class Cliente {
    
    private String nombre;
    private String Direccion;
    private List<Animal> mascotas;

    public Cliente(String nombre, String Direccion) {
        this.nombre = nombre;
        this.Direccion = Direccion;
        this.mascotas  = new ArrayList <>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public List<Animal> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Animal> mascotas) {
        this.mascotas = mascotas;
    }
    
    
    public void agregarMascota (Animal mascota) {
        mascotas.add(mascota);
    }
    
    @Override
    public String toString (){
        
        return "Cliente " + nombre + " , Dirreccion " + Direccion + "  Mascotas " + mascotas.size();
    } 
    
    
    
    
}
