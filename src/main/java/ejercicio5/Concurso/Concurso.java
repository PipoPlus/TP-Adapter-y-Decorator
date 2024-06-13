package ejercicio5.Concurso;

import ejercicio5.Concurso.Email.EnvioMail;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Concurso {
    String nombreConcurso;
    LocalDateTime fechaInicio, fechaCierre;
    List<Participante> listaParticipantes = new ArrayList<>();
    private RegistroConcurso registro;
    private ProveedorDeFechas proveedorFecha;
    private EnvioMail notificar;

    public Concurso(String nombre, LocalDateTime fechaI, LocalDateTime fechaC, RegistroConcurso registro, ProveedorDeFechas proveedorFecha, EnvioMail notificacion) {
        this.nombreConcurso = nombre;
        this.fechaInicio = fechaI;
        this.fechaCierre = fechaC;
        this.registro = registro;
        this.proveedorFecha = proveedorFecha;
        this.notificar = notificacion;
    }


    public void inscribirseAlConcurso(Participante participante) {
        if (!estaAbierto()) {
            throw new RuntimeException("El concurso está cerrado para inscripciones.");
        }
        participante.sumarPuntos(this);
        listaParticipantes.add(participante);
        guardarInscripcion(participante);
    }

    private void guardarInscripcion(Participante participante) {
        this.registro.registrar(participante.getNombre(), this.proveedorFecha.fecha(), this.nombreConcurso);
        this.notificar.enviarNotificacion(participante.getNombre(), this.nombreConcurso);
    }

    public boolean esPrimerDia() {
        LocalDateTime fechaActual = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaActualS = formatter.format(this.proveedorFecha.fecha());
        String fechaInicioS = formatter.format(fechaInicio);
        return fechaActualS.equals(fechaInicioS);
    }

    public String getNombreConcurso() {
        return nombreConcurso;
    }

    public boolean inscripto(Participante participante) {
        for (Participante p : listaParticipantes) {
            if (p.equals(participante)) return true;
        }
        return false;
    }

    public boolean estaAbierto() {
        LocalDateTime fechaActual = this.proveedorFecha.fecha();
        return !fechaActual.isBefore(fechaInicio) && !fechaActual.isAfter(fechaCierre);
    }
}

