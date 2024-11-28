package ANIMALES;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {

    private List<Cliente> clientes;

    public Veterinaria() {
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("El cliente no puede ser nulo.");
        }
        if (clientes.stream().anyMatch(c -> c.getNombre().equalsIgnoreCase(cliente.getNombre()))) {
            System.out.println("El cliente ya está registrado.");
            return;
        }
        clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public Cliente buscarClientePorNombre(String nombre) {
        return clientes.stream()
                       .filter(c -> c.getNombre().equalsIgnoreCase(nombre))
                       .findFirst()
                       .orElse(null);
    }

    public boolean eliminarCliente(String nombre) {
        return clientes.removeIf(c -> c.getNombre().equalsIgnoreCase(nombre));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Clientes registrados:\n");
        for (Cliente cliente : clientes) {
            sb.append(cliente).append("\n");
        }
        return sb.toString();
    }
}

