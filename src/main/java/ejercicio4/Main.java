package ejercicio4;

public class Main {

    public static void main(String[]args){

        Combo comboSimple = new ComboBasico(100,"1 Hamburguesa");
        System.out.println(comboSimple.costoFinal());
        System.out.println(comboSimple.darDescripcion());

        System.out.println("");
        Combo comboFamiliar = new ComboFamiliar(comboSimple);
        System.out.println(comboFamiliar.costoFinal());
        System.out.println(comboFamiliar.darDescripcion());

        System.out.println("");
        Combo comboEspecial = new ComboEspecial(comboSimple);
        System.out.println(comboEspecial.costoFinal());
        System.out.println(comboEspecial.darDescripcion());


    }



}
