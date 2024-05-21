package ejercicio1;

public class MotorElectricoAdapter implements Motor{

    private MotorElectrico motorElectrico;

    public MotorElectricoAdapter(MotorElectrico motorElectrico){
        this.motorElectrico = motorElectrico;
    }

    @Override
    public void arrancar() {
        motorElectrico.activar();
        motorElectrico.conectar();
    }

    @Override
    public void acelerar() {
        motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        motorElectrico.detener();
        motorElectrico.desconectar();
    }
}
