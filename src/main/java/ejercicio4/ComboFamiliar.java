package ejercicio4;

public class ComboFamiliar extends ComboDecorator{
    public ComboFamiliar(Combo combo) {
        super(combo);
    }

    @Override
    public double costoFinal(){
        return combo.costoFinal() + 50.0;
    }

    @Override
    public String darDescripcion() {
        return combo.darDescripcion() + " + 3 Combos Simples";
    }
}
