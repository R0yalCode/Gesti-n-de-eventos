import java.time.LocalDateTime;

public class EventoSocial extends Evento {
    private String tematica;
    private String vestimentaRequerida;
    private int duracion;
    private String tipoMusica;

    // Constructor
    public EventoSocial(String tipoDeEvento, String nombre, LocalDateTime fechaInicio, LocalDateTime fechaFin,
                        String tematica, String vestimentaRequerida, int duracion, String tipoMusica) {
        super(tipoDeEvento, nombre, fechaInicio, fechaFin);
        this.tematica = tematica;
        this.vestimentaRequerida = vestimentaRequerida;
        this.duracion = duracion;
        this.tipoMusica = tipoMusica;
    }

    // Getters y Setters
    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public String getVestimentaRequerida() {
        return vestimentaRequerida;
    }

    public void setVestimentaRequerida(String vestimentaRequerida) {
        this.vestimentaRequerida = vestimentaRequerida;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTipoMusica() {
        return tipoMusica;
    }

    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }
}
