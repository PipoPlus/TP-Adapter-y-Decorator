package ejercicio5.Concurso;

public abstract class ConcursoDecorator implements Concurso {
    protected Concurso concursoDecorado;

    public ConcursoDecorator(Concurso concursoDecorado) {
        this.concursoDecorado = concursoDecorado;
    }

    @Override
    public void inscribirseAlConcurso(Participante participante) {
        concursoDecorado.inscribirseAlConcurso(participante);
    }
}


