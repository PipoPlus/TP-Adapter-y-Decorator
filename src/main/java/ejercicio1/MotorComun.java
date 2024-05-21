package ejercicio1;

public class MotorComun implements Motor{
    @Override
    public void arrancar() {
        System.out.println("Arranca el motor Comun");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelera el motor Comun");
    }

    @Override
    public void apagar() {
        System.out.println("Apaga el motor Comun");
    }
}
