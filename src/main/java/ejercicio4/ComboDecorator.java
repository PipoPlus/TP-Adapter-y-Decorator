package ejercicio4;

abstract class ComboDecorator implements Combo{

    Combo combo;
    public ComboDecorator(Combo combo){
        this.combo = combo;
    }

    @Override
    public double costoFinal() {
        return combo.costoFinal();
    }

    @Override
    public String darDescripcion() {
        return combo.darDescripcion();
    }
}
