public class Organizador extends Persona {
    private String responsabilidad;

    // Constructor
    public Organizador(String cedula, String nombre, String telefono, String responsabilidad) {
        super(cedula, nombre, telefono);
        this.responsabilidad = responsabilidad;
    }

    // Getters y Setters
    public String getResponsabilidad() {
        return responsabilidad;
    }

    public void setResponsabilidad(String responsabilidad) {
        this.responsabilidad = responsabilidad;
    }
}
