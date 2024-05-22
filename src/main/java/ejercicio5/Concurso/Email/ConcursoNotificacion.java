package ejercicio5.Concurso.Email;

import ejercicio5.Concurso.Concurso;
import ejercicio5.Concurso.ConcursoDecorator;
import ejercicio5.Concurso.ConcursoEspecifico;
import ejercicio5.Concurso.Participante;

public class ConcursoNotificador extends ConcursoDecorator {
    public ConcursoNotificador(Concurso concursoDecorado) {
        super(concursoDecorado);
    }

    @Override
    public void inscribirseAlConcurso(Participante participante) {
        super.inscribirseAlConcurso(participante);
        NotificarPorMail.enviarNotificacion(participante.getNombre(), ((ConcursoEspecifico) concursoDecorado).getNombreConcurso());
    }
}
