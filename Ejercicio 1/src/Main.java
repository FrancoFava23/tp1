// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Deportista> listaDeDeportistas = new ArrayList<>();
        Deportista deportista = null; //grande chatGPT, siempre se pone la 10
        do {
            deportista = crearDeportista(scanner);
            agregarDeportista(listaDeDeportistas, deportista);
        } while (!deportista.getNombre().equalsIgnoreCase("Finn"));
        máximaCantMedallas(listaDeDeportistas);
    }

    private static Deportista crearDeportista(Scanner scanner) {
        String nombre = scanner.nextLine();
        String apellido = scanner.nextLine();
        String apellidoProfesor = scanner.nextLine();
        String deporte = scanner.nextLine();
        String fecha = scanner.nextLine();
        int dni = scanner.nextInt();
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
/*Programa que implemente informacion de deportistas. Se termina de leer cuando aparezca finn, que se debe procesar.

Hacer los setters y getters de todas las variables del objeto, un módulo que cree un deportista, ese módulo implementarlo después en el array list.
Para hacer el array list, utilizo ArrayList<Deportista> deportistas = new ArrayList<>();. Ahí empiezo a iterar creando nuevos deportistas, y utilizando
deportistas.add(crearDeportista()), para ir agregando los deportistas a la lista.
Cómo itero? Mientras
Para manejarme en la lista, uso un while y una variable índice, la cual voy aumentando en cada iteración, y para acceder a los datos de la lista,
usando deportistas.get(índice).
Hacer un modulo que sea para que devuelva todo con una sola invocación, no?

Pseudo esquema del primer punto:
Inicializo scanner,
Inicializo lista,
do
ProcesoAgregarLista,
while(this.deportista.nombre != Finn)

Para el segundo punto, hago un modulo que recorra la lista (ya chatGPT me dirá cómo) y mantenga actualizada una variable para tener el maximo
 */