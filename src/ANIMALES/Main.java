package ANIMALES;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Veterinaria veterinaria = new Veterinaria();

        while (true) {
            System.out.println("!! BIENVENIDO A LA VETERINARIA J&C !! ");
            System.out.println("1. Ingresa o Agrega un Cliente");
            System.out.println("2. Lista de Clientes");
            System.out.println("3. Borrar un Cliente");
            System.out.println("4. Info");
            System.out.println("5. Salir");
            System.out.println("Elija una opción del Menú:");
            int opcion = entrada.nextInt();
            entrada.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingresa tu Nombre Completo:");
                    String nombreCliente = entrada.nextLine();

                    System.out.println("Ingresa tu Dirección:");
                    String direccionCliente = entrada.nextLine();
                    Cliente cliente = new Cliente(nombreCliente, direccionCliente);

                    System.out.println("Ingresa la cantidad de Mascotas:");
                    int numMascotas = entrada.nextInt();
                    entrada.nextLine();

                    for (int i = 0; i < numMascotas; i++) {
                        System.out.println("Ingresa el nombre de la mascota " + (i + 1) + ":");
                        String nombreMascota = entrada.nextLine();
                        System.out.println("Ingresa la especie de la mascota " + (i + 1) + ":");
                        String especieMascota = entrada.nextLine();
                        System.out.println("Ingresa la edad de la mascota " + (i + 1) + ":");
                        int edadMascota = entrada.nextInt();
                        entrada.nextLine();

                        Animal mascota = new Animal(nombreMascota, especieMascota, edadMascota);
                        cliente.agregarMascota(mascota);
                    }

                    veterinaria.agregarCliente(cliente);
                    System.out.println("Cliente ingresado exitosamente.");
                }
                case 2 -> {
                    System.out.println("El listado de clientes es:");
                    for (Cliente c : veterinaria.getClientes()) {
                        System.out.println(c);
                    }
                }
                case 3 -> {
                    System.out.println("Ingresa el nombre del cliente que deseas borrar:");
                    String nombreABorrar = entrada.nextLine();

                    boolean eliminado = veterinaria.eliminarCliente(nombreABorrar);
                    if (eliminado) {
                        System.out.println("El cliente " + nombreABorrar + " ha sido eliminado exitosamente.");
                    } else {
                        System.out.println("No se encontró ningún cliente con el nombre: " + nombreABorrar);
                    }
                }
                case 4 -> {
                    System.out.println("!! MANTENIMIENTO DE SOFTWARE !!");
                    System.out.println("!! Corporación Universitaria Iberoamericana !!");
                    System.out.println("Desarrollado por JORGE ANDRES RODRIGUEZ NUÑEZ - MARIA CAMILA HENAO TORO");
                }
                case 5 -> {
                    System.out.println("!! Gracias por confiar en nosotros, vuelve pronto !!");
                    System.exit(0);
                }
                default -> System.out.println("Opción inválida, por favor selecciona una opción válida.");
            }
        }
    }
}
