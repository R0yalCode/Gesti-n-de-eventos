import java.time.LocalDateTime;

public class EventoAcademico extends Evento {
    private String temaPrincipal;
    private int numeroConferencia;

    // Constructor
    public EventoAcademico(String tipoDeEvento, String nombre, LocalDateTime fechaInicio, LocalDateTime fechaFin,
                           String temaPrincipal, int numeroConferencia) {
        super(tipoDeEvento, nombre, fechaInicio, fechaFin);
        this.temaPrincipal = temaPrincipal;
        this.numeroConferencia = numeroConferencia;
    }

    // Getters y Setters
    public String getTemaPrincipal() {
        return temaPrincipal;
    }

    public void setTemaPrincipal(String temaPrincipal) {
        this.temaPrincipal = temaPrincipal;
    }

    public int getNumeroConferencia() {
        return numeroConferencia;
    }

    public void setNumeroConferencia(int numeroConferencia) {
        this.numeroConferencia = numeroConferencia;
    }
}
