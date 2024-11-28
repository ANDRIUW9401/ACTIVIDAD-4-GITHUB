
package ANIMALES;

import java.util.Scanner;


public class Main {
    
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        Veterinaria veterinaria = new Veterinaria ();
        
        while (true){
            System.out.println("!! BIENVENIDO A LA VETERINARIA J&C !! ");
            System.out.println("1.Ingresa o Agrega un Cliente");
            System.out.println("2.Lista de Clientes");
            System.out.println("3.Salir ");
            System.out.println("4.Info");
            System.out.println("Elija una opcion del Menu");
            int opcion = entrada.nextInt();
            // limpiar buffer
            entrada.nextLine();
            
            switch(opcion){
            
            case 1 -> {
                System.out.println("Ingresa tu Nombre Completo");
                String nombreCliente = entrada.nextLine ();
                
                System.out.println("Ingresa  tu Direccion");
                String direccionCliente = entrada.nextLine ();
                Cliente cliente = new Cliente (nombreCliente, direccionCliente);
                
                System.out.println("Ingresa la cantidad de Mascotas");
                int numMascotas = entrada.nextInt();
                entrada.nextLine();
                
                
                for (int i=0 ; i< numMascotas; i++){
                    System.out.println("Ingresa el nombre del mascota" + (i+1)+ ";");
                    String nombreMascotas = entrada.nextLine();
                    System.out.println("Ingresa la especie " + (i+1)+ ";");
                    String especieMascotas = entrada.nextLine();
                    System.out.println("Ingresa la edad" + (i+1)+ ";");
                    int edadMascota = entrada.nextInt();
                    entrada.nextLine();
                    
                    Animal mascota = new Animal (nombreMascotas,especieMascotas,edadMascota);
                    cliente.agregarMascota(mascota);
                    
                }
                
                veterinaria.agregarCliente(cliente);
                System.out.println("Cliente ingresado exitosamente");
                }
               
               
            case 2 -> {
                System.out.println("El listado de clientes es ");
                for (Cliente c: veterinaria.getClientes ()){
                    System.out.println(c);
                }
                }
            case 3 -> {
                System.out.println("!! Gracias por Confiar en nosotros vuelve Pronto !!");
                System.exit(0);
                }
                
            case 4 -> {
                System.out.println("!! MANTENIMIENTO DE SOFTWARE   !!");
                System.out.println("!! Corporación Universitaria Iberoamericana  !!");
                System.out.println("Desarrollado por JORGE ANDRES RODRIGUEZ NUÑEZ - MARIA CAMILA HENAO TORO");
                System.exit(0);
                }

            default -> System.out.println("Opcion Invalida, Valida las opciones del Menu");
        }
            
        }
    }
}
