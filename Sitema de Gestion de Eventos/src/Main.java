import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Direccion
        Direccion direccion = new Direccion("Calle Principal", "Calle Secundaria", "Referencia");

        // Crear una instancia de SalonDeEventos
        SalonDeEventos salonDeEventos = new SalonDeEventos("Salon Elegante", LocalDate.now(), "Lista de Participantes", 100, direccion);

        // Crear una instancia de EventoSocial
        EventoSocial eventoSocial = new EventoSocial("Social", "Fiesta de Fin de Año", LocalDateTime.now(), LocalDateTime.now().plusHours(5), "Temática", "Formal", 5, "Pop");

        // Crear una instancia de EventoBenefico
        EventoBenefico eventoBenefico = new EventoBenefico("Benefico", "Recaudación de Fondos", LocalDateTime.now(), LocalDateTime.now().plusDays(1), 1000.0f, "Organización ABC");

        // Crear una instancia de EventoAcademico
        EventoAcademico eventoAcademico = new EventoAcademico("Academico", "Conferencia de Tecnología", LocalDateTime.now(), LocalDateTime.now().plusHours(8), "Innovación", 3);

        // Crear una instancia de EventoDeportivo
        EventoDeportivo eventoDeportivo = new EventoDeportivo("Deportivo", "Maratón", LocalDateTime.now(), LocalDateTime.now().plusHours(3), "Atletismo", "Medalla");

        // Crear una instancia de Persona
        Persona persona = new Persona("0102030405", "Juan Perez", "123456789");

        // Crear una instancia de Conferencista
        Conferencista conferencista = new Conferencista("0102030406", "Ana Gómez", "987654321", "Tecnología");

        // Crear una instancia de Participante
        Participante participante = new Participante("0102030407", "Luis Fernández", "112233445");

        // Crear una instancia de Asistente
        Asistente asistente = new Asistente("0102030408", "María López", "223344556", true);

        // Crear una instancia de Organizador
        Organizador organizador = new Organizador("0102030409", "Carlos Martinez", "998877665", "Coordinar Evento");

        // Imprimir detalles para comprobar
        System.out.println("Dirección: " + direccion.getCallePrincipal() + ", " + direccion.getCalleSecundaria() + ", " + direccion.getReferencia());
        System.out.println("Salón de Eventos: " + salonDeEventos.getNombre() + ", Fecha: " + salonDeEventos.getFecha() + ", Capacidad: " + salonDeEventos.getCapacidad());
        System.out.println("Evento Social: " + eventoSocial.getNombre() + ", Temática: " + eventoSocial.getTematica());
        System.out.println("Evento Benéfico: " + eventoBenefico.getNombre() + ", Meta Recaudación: " + eventoBenefico.getMetaRecaudacion());
        System.out.println("Evento Académico: " + eventoAcademico.getNombre() + ", Tema Principal: " + eventoAcademico.getTemaPrincipal());
        System.out.println("Evento Deportivo: " + eventoDeportivo.getNombre() + ", Deporte Principal: " + eventoDeportivo.getDeportePrincipal());
        System.out.println("Persona: " + persona.getNombre() + ", Teléfono: " + persona.getTelefono());
        System.out.println("Conferencista: " + conferencista.getNombre() + ", Especialidad: " + conferencista.getEspecialidad());
        System.out.println("Participante: " + participante.getNombre() + ", Teléfono: " + participante.getTelefono());
        System.out.println("Asistente: " + asistente.getNombre() + ", Confirmación Asistencia: " + asistente.isConfirmacionAsistencia());
        System.out.println("Organizador: " + organizador.getNombre() + ", Responsabilidad: " + organizador.getResponsabilidad());
    }
}
