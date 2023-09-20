public class Deportista {
    private String nombre;

    private String apellido;

    private String fechaNacimiento;

    private String deporte;

    private String apellidoProfesor;

    private int dni;

    private int medallasGanadas;

    public void setNombre(String nombre){this.nombre=nombre;}

    public void setApellido(String apellido){this.apellido=apellido;}

    public void setFecha(String fecha){this.fechaNacimiento=fecha;}

    public void setApellidoProfesor(String apellidoProfesor) {this.apellidoProfesor = apellidoProfesor;}

    public void setDeporte(String deporte) {this.deporte = deporte;}

    public void setDni(int dni) {this.dni = dni;}

    public void setMedallasGanadas(int medallasGanadas) {this.medallasGanadas = medallasGanadas;}

    public String getNombre() {return nombre;}

    public String getApellido() {return apellido;}

    public String getApellidoProfesor() {return apellidoProfesor;}

    public int getMedallasGanadas() {return medallasGanadas;}

    public Deportista (String nombre, String apellido, String fecha, int dni, String deporte, String apellidoProfesor, int medallasGanadas){
        setNombre(nombre);
        setApellido(apellido);
        setDni(dni);
        setApellidoProfesor(apellidoProfesor);
        setDeporte(deporte);
        setMedallasGanadas(medallasGanadas);
        setFecha(fecha);
    }
}

/*nombre, apellido, fecha de nacimiento, deporte, profesor, dni, numero de medallas ganadas. Anotar cómo llego a diversas conclusiones como anotaciones.
 */