package ejercicio4;

public class ComboEspecial extends ComboDecorator{
    public ComboEspecial(Combo combo) {
        super(combo);
    }

    @Override
    public double costoFinal() {
        return combo.costoFinal() + 20.0;
    }

    @Override
    public String darDescripcion() {
        return combo.darDescripcion() + " con extra Bacon y extra Papas Especiales";
    }
}
