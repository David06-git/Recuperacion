import java.util.LinkedList;
import java.util.Scanner;

public class Metodos {
    
    //VALIDACIONES
    public String validarSoloLetras(String mensaje) {

        System.out.print(mensaje);
        String dato = sc.nextLine();

        if (dato.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
            return dato;
        }

        System.out.println("ERROR. Solo letras.");
        return validarSoloLetras(mensaje);
    }
    
    
    public LinkedList<Objvehiculo> IngresarRegistro(LinkedList<Objvehiculo> lista){
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        int opt = 0;
        while (continuar) {
            Objvehiculo v = new Objvehiculo();
            System.out.println("Ingrese la placa ");
            v.setPlaca(sc.next());
            System.out.println("Ingrese la hora de entrada");
            v.setHoraEntrada(sc.next());
            System.out.println("Ingrese el estado del vehiculo");
            opt = sc.nextInt();
            if (opt == 3) {
                System.out.println("Ingrese el estado del vehiculo: Pendiente o Despachado");
                v.setEstado(sc.next());
            }
            System.out.println("4) desesa seguir ingresando datos ?  1) si    2) no" );
            if (opt == 2) {
                continuar = false;
            }
        }
        return lista;
    }

    public void Buscar(LinkedList<Objvehiculo> lista){
        for (Objvehiculo b: lista){
            if (b.getPlaca().equals(b)) {
                System.out.println("\"El vehiculo con placa: "+b.getPlaca()+" esta registrado\"");
            }
            System.out.println("El vehiculo con placa: "+b.getPlaca()+" no esta registrado");
        }
    }

    public void modificar(){
         LinkedList<Objvehiculo> lista = new LinkedList<>();

    }


}
