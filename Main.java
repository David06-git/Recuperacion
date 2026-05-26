import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Metodos m = new Metodos();
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
            switch (opt) {
                case 1:
                    
                    break;

                case 2:
                    
                    break;

                case 3:
                    
                    break;

                case 4:
                    
                    break;

                case 5:
                    
                    break;

                case 6:
                    System.out.println("Hasta luego");
                    break;
            
                default:
                    System.out.println("opcion invalida. Intente de nuevo");
                    break;
            }
        }
    }
}
