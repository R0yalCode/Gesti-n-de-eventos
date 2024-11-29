import java.time.LocalDate;

public class SalonDeEventos {
    private String nombre;
    private LocalDate fecha;
    private String listaParticipantes;
    private int capacidad;
    private Direccion direccion;

    // Constructor
    public SalonDeEventos(String nombre, LocalDate fecha, String listaParticipantes, int capacidad, Direccion direccion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.listaParticipantes = listaParticipantes;
        this.capacidad = capacidad;
        this.direccion = direccion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getListaParticipantes() {
        return listaParticipantes;
    }

    public void setListaParticipantes(String listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
