package ejercicio5.Concurso;

public class Participante {

    private String nombre;
    private int puntos;
    private static final int PUNTOS_EXTRA = 10;

    public Participante(String name) {

        this.nombre = name;
        this.puntos = 0;

    }

    public int calcularPuntos(ConcursoEspecifico concurso) {
        if (concurso.esPrimerDia()) {
            return PUNTOS_EXTRA;
        } else {
            return  0;
        }
    }

    public void sumarPuntos(ConcursoEspecifico concurso){ puntos =+ calcularPuntos(concurso); }

    public String getNombre() {
        return nombre;
    }
}