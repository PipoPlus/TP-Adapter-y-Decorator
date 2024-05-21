package ejercicio4;

public class Main {

    public static void main(String[]args){
        //Combo Basico
        Combo comboBasico = new ComboBasico(100,"1 Hamburguesa");

        System.out.println(comboBasico.costoFinal());
        System.out.println(comboBasico.darDescripcion());

        //Combo Familiar
        System.out.println("");
        Combo comboFamiliar = new ComboFamiliar(comboBasico);

        System.out.println(comboFamiliar.costoFinal());
        System.out.println(comboFamiliar.darDescripcion());

        //Combo Especial
        System.out.println("");
        Combo comboEspecial = new ComboEspecial(comboBasico);

        System.out.println(comboEspecial.costoFinal());
        System.out.println(comboEspecial.darDescripcion());


    }



}
