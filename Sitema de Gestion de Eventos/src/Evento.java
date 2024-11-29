import java.time.LocalDateTime;

public class Evento {
    private String tipoDeEvento;
    private String nombre;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;

    // Constructor
    public Evento(String tipoDeEvento, String nombre, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
        this.tipoDeEvento = tipoDeEvento;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    // Getters y Setters
    public String getTipoDeEvento() {
        return tipoDeEvento;
    }

    public void setTipoDeEvento(String tipoDeEvento) {
        this.tipoDeEvento = tipoDeEvento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }
}
