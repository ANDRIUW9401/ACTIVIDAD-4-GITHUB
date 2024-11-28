
package ANIMALES;

import java.util.ArrayList;
import java.util.List;


public class Veterinaria {
    
    private List<Cliente> clientes;
    
    public Veterinaria() {
        this.clientes = new ArrayList<>();
    }
    public void agregarCliente(Cliente cliente){
       clientes.add(cliente);
    }
    public List<Cliente> getClientes (){
    return clientes;
    }

}




