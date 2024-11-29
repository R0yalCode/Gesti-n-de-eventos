public class Asistente extends Participante {
    private boolean confirmacionAsistencia;

    // Constructor
    public Asistente(String cedula, String nombre, String telefono, boolean confirmacionAsistencia) {
        super(cedula, nombre, telefono);
        this.confirmacionAsistencia = confirmacionAsistencia;
    }

    // Getters y Setters
    public boolean isConfirmacionAsistencia() {
        return confirmacionAsistencia;
    }

    public void setConfirmacionAsistencia(boolean confirmacionAsistencia) {
        this.confirmacionAsistencia = confirmacionAsistencia;
    }
}
