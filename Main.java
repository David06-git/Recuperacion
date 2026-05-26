import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Metodos m = new Metodos();
        LinkedList<Objvehiculo> lista = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        int opt = 0;

        while (seguir) {
            System.out.println("-------- Bienvenido al taller nacho lee--------");
            System.out.println("1) ingresar vehiculo");
            System.out.println("2) consultar vehiculo");
            System.out.println("3) modificar vehiculo");
            System.out.println("4) despachar vehiculo");
            System.out.println("5) mostar vehiculo");
            System.out.println("6) Salir");
            opt = sc.nextInt();
            sc.nextLine();
            switch (opt) {
                case 1:
                    lista = m.IngresarRegistro(lista);
                    break;

                case 2:
                    m.Buscar(lista);
                    break;

                case 3:
                    m.modificar(lista);
                    break;

                case 4:
                    System.out.println("Procediendo a despachar un vehículo:");
                    m.modificar(lista);
                    break;

                case 5:
                    m.MostrarPorEstado(lista, "Pendiente");
                    m.MostrarPorEstado(lista, "Despachado");
                    break;

                case 6:
                    System.out.println("Hasta luego");
                    seguir = false;
                    break;
            
                default:
                    System.out.println("opcion invalida. Intente de nuevo");
                    break;
            }
        }
    }
}
