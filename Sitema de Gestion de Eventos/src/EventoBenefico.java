import java.time.LocalDateTime;

public class EventoBenefico extends Evento {
    private float metaRecaudacion;
    private String organizacionBeneficiada;

    // Constructor
    public EventoBenefico(String tipoDeEvento, String nombre, LocalDateTime fechaInicio, LocalDateTime fechaFin,
                          float metaRecaudacion, String organizacionBeneficiada) {
        super(tipoDeEvento, nombre, fechaInicio, fechaFin);
        this.metaRecaudacion = metaRecaudacion;
        this.organizacionBeneficiada = organizacionBeneficiada;
    }

    // Getters y Setters
    public float getMetaRecaudacion() {
        return metaRecaudacion;
    }

    public void setMetaRecaudacion(float metaRecaudacion) {
        this.metaRecaudacion = metaRecaudacion;
    }

    public String getOrganizacionBeneficiada() {
        return organizacionBeneficiada;
    }

    public void setOrganizacionBeneficiada(String organizacionBeneficiada) {
        this.organizacionBeneficiada = organizacionBeneficiada;
    }
}
