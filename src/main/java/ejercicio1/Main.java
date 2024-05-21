package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Motor motorComun = new MotorComun();
        Motor motorEconomico = new MotorEconomico();
        MotorElectrico motorElectrico = new MotorElectrico();
        Motor motorAdaptado = new MotorElectricoAdapter(motorElectrico);

        System.out.println("");
        motorComun.arrancar();
        motorComun.acelerar();
        motorComun.apagar();

        System.out.println("");
        motorEconomico.arrancar();
        motorEconomico.acelerar();
        motorEconomico.apagar();

        System.out.println("");
        motorAdaptado.arrancar();
        motorAdaptado.acelerar();
        motorAdaptado.apagar();
    }
}
