public class Conferencista extends Persona {
    private String especialidad;

    // Constructor
    public Conferencista(String cedula, String nombre, String telefono, String especialidad) {
        super(cedula, nombre, telefono);
        this.especialidad = especialidad;
    }

    // Getters y Setters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
