import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Deportista> listaDeDeportistas = new ArrayList<>();
    private Deportista deportista;
    public void Programa(){
        //Deportista deportista = null; //grande chatGPT, siempre se pone la 10
        do {
            deportista = crearDeportista(scanner);
            agregarDeportista(listaDeDeportistas, deportista);
        } while (!deportista.getNombre().equalsIgnoreCase("Finn"));
        máximaCantMedallas(listaDeDeportistas);
    }

    private Deportista crearDeportista(Scanner scanner) {
        System.out.println("Ingrese nombre del deportista:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese apellido del deportista:");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese apellido del profesor:");
        String apellidoProfesor = scanner.nextLine();
        System.out.println("Ingrese el deporte:");
        String deporte = scanner.nextLine();
        System.out.println("Ingrese fecha de nacimiento del deportista:");
        String fecha = scanner.nextLine();
        System.out.println("Ingrese dni del deportista:");
        int dni = scanner.nextInt();
        System.out.println("Ingrese cantidad de medallas ganadas:");
        int medallasGanadas = scanner.nextInt();
        return new Deportista(nombre, apellido, fecha, dni, deporte, apellidoProfesor, medallasGanadas);
    }

    public static void agregarDeportista(ArrayList<Deportista> lista, Deportista deportista) {
        lista.add(deportista);
    }

    public static void máximaCantMedallas(ArrayList<Deportista> lista){
        Deportista maximoDep = null; //creo un deprtista vacio donde guardar al deportista del que tengo que informar todos los datos
        int max=0; //inicializo un valor maximo
        for (Deportista indice : lista){
            if (indice.getMedallasGanadas() > max){ //si el deportista tiene mas medallas, actualizo el maximo y copio el objeto indice en el objeto maximo
                maximoDep=indice;
                max=indice.getMedallasGanadas();
            }
        }
        if (max != 0){ //Si existen medallas, informo los valores pedidos.
            System.out.print("El nombre del deportista con mayor cantidad de medallas es: "+ maximoDep.getNombre()+ maximoDep.getApellido()+ " y su profesor es: "+ maximoDep.getApellidoProfesor());
        }else{ //Si max es 0, significa que no se entregaron medallas.
            System.out.print("No se entregaron medallas.");
        }
    }

}
