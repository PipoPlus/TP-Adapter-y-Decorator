package ejercicio4;

public class ComboBasico implements Combo{

    double precio;
    String descripcion;

    public ComboBasico(double precio, String descripcion){
       this.precio = precio;
       this.descripcion = descripcion;
    }

    public double costoFinal(){
        return this.precio;
    }

    public String darDescripcion(){
        return this.descripcion;
    }
}
