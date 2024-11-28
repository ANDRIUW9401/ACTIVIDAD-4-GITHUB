package ANIMALES;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nombre;
    private String direccion;
    private List<Animal> mascotas;

    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.mascotas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Animal> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Animal> mascotas) {
        this.mascotas = mascotas;
    }

    public void agregarMascota(Animal mascota) {
        mascotas.add(mascota);
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + ", Dirección: " + direccion + ", Mascotas: " + mascotas.size();
    }
}
