import java.util.LinkedList;
import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);
    
    //VALIDACIONES

    public String validarSoloLetras(String mensaje) {
        System.out.print(mensaje);
        String dato = sc.nextLine();
        if (dato.matches("[a-zA-Z áéíóúÁÉÍÓÚñÑ ]+")) {
            return dato;
        }
        System.out.println("ERROR. Solo letras.");
        return validarSoloLetras(mensaje);
    }
    
    public String validarPlaca(String mensaje) {
        System.out.print(mensaje);
        String placa = sc.nextLine().toUpperCase().trim(); 
        if (placa.matches("[a-zA-Z0-9]+")) {
            return placa;
        }
        System.out.println("ERROR. Placa inválida (solo use letras y números).");
        return validarPlaca(mensaje);
    }
    
    public LinkedList<Objvehiculo> IngresarRegistro(LinkedList<Objvehiculo> lista) {
        boolean continuar = true;
        
        while (continuar) {
            Objvehiculo v = new Objvehiculo();
            
            v.setPlaca(validarPlaca("Ingrese la placa: "));
            
            System.out.print("Ingrese la hora de entrada (ej: 08:30 AM): ");
            v.setHoraEntrada(sc.nextLine());
            
            v.setEstado("Pendiente");
            
            lista.add(v);
            System.out.println("¡Vehículo registrado con éxito!");
            System.out.print("¿Desea seguir ingresando datos? 1) Sí - 2) No: ");
            int opt = sc.nextInt();
            sc.nextLine();
            
            if (opt == 2) {
                continuar = false;
            }
        }
        return lista;
    }

    public void Buscar(LinkedList<Objvehiculo> lista) {
        if (lista.isEmpty()) {
            System.out.println("El taller está vacío.");
            return;
        }
        
        String placaBuscar = validarPlaca("Ingrese la placa del vehículo a consultar: ");
        boolean encontrado = false;

        for (Objvehiculo b : lista) {
            if (b.getPlaca().equalsIgnoreCase(placaBuscar)) { 
                System.out.println("\n--- VEHÍCULO ENCONTRADO ---");
                System.out.println("Placa: " + b.getPlaca());
                System.out.println("Hora de Entrada: " + b.getHoraEntrada());
                System.out.println("Estado: " + b.isEstado());
                System.out.println("---------------------------");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El vehículo con placa " + placaBuscar + " no está registrado.");
        }
    }

    public void modificar(LinkedList<Objvehiculo> lista) {
        if (lista.isEmpty()) {
            System.out.println("No hay vehículos para modificar.");
            return;
        }

        String placaBuscar = validarPlaca("Ingrese la placa del vehículo a modificar: ");
        boolean encontrado = false;

        for (Objvehiculo b : lista) {
            if (b.getPlaca().equalsIgnoreCase(placaBuscar)) {
                encontrado = true;
                System.out.println("Vehículo encontrado. Estado actual: " + b.isEstado());
                System.out.println("¿Qué desea modificar? 1) Hora de Entrada  2) Estado (Pendiente/Despachado)");
                int opcion = sc.nextInt();
                sc.nextLine(); 

                if (opcion == 1) {
                    System.out.print("Ingrese la nueva hora de entrada: ");
                    b.setHoraEntrada(sc.nextLine());
                    System.out.println("Hora actualizada.");
                } else if (opcion == 2) {
                    System.out.print("Ingrese el nuevo estado (Pendiente / Despachado): ");
                    b.setEstado(sc.nextLine());
                    System.out.println("Estado actualizado.");
                } else {
                    System.out.println("Opción no válida.");
                }
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Vehículo no encontrado.");
        }
    }

    public void MostrarPorEstado(LinkedList<Objvehiculo> lista, String estadoFiltro) {
        if (lista.isEmpty()) {
            System.out.println("No hay vehículos registrados en el sistema.");
            return;
        }

        System.out.println("\n--- VEHÍCULOS " + estadoFiltro.toUpperCase() + "S ---");
        boolean hayVehiculos = false;

        for (Objvehiculo v : lista) {
            if (v.isEstado().equalsIgnoreCase(estadoFiltro)) {
                System.out.println("Placa: " + v.getPlaca() + " | Entrada: " + v.getHoraEntrada());
                hayVehiculos = true;
            }
        }

        if (!hayVehiculos) {
            System.out.println("No hay vehículos con el estado: " + estadoFiltro);
        }
        System.out.println("------------------------------------");
    }
}
