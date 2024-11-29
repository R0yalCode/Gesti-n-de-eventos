import java.time.LocalDateTime;

public class EventoDeportivo extends Evento {
    private String deportePrincipal;
    private String premioOtorgado;

    // Constructor
    public EventoDeportivo(String tipoDeEvento, String nombre, LocalDateTime fechaInicio, LocalDateTime fechaFin,
                           String deportePrincipal, String premioOtorgado) {
        super(tipoDeEvento, nombre, fechaInicio, fechaFin);
        this.deportePrincipal = deportePrincipal;
        this.premioOtorgado = premioOtorgado;
    }

    // Getters y Setters
    public String getDeportePrincipal() {
        return deportePrincipal;
    }

    public void setDeportePrincipal(String deportePrincipal) {
        this.deportePrincipal = deportePrincipal;
    }

    public String getPremioOtorgado() {
        return premioOtorgado;
    }

    public void setPremioOtorgado(String premioOtorgado) {
        this.premioOtorgado = premioOtorgado;
    }
}
