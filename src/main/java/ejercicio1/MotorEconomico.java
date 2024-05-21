package ejercicio1;

public class MotorEconomico implements Motor{
    @Override
    public void arrancar() {
        System.out.println("Arranca el motor Economico");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelera el motor Economico");
    }

    @Override
    public void apagar() {
        System.out.println("Apaga el motor Economico");
    }
}
