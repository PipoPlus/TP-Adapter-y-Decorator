package ejercicio5.Concurso;

import java.time.LocalDateTime;

public class FechaActual implements ProveedorDeFechas{
    @Override
    public LocalDateTime fecha() {
        return LocalDateTime.now();
    }
}
