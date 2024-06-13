package ejercicio5;

import ejercicio5.Concurso.ProveedorDeFechas;

import java.time.LocalDateTime;

public class FakeProveedorDeFechas implements ProveedorDeFechas {

    @Override
    public LocalDateTime fecha() {
        return LocalDateTime.of(2024,04,07,10,30,50);
    }
}
