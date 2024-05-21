package ejercicio2;

import java.awt.*;

public class Graphics2DAdapter implements Panel{

    Graphics2D g2d;

    public Graphics2DAdapter (Graphics2D g2d){
        this.g2d = g2d;
    }


    @Override
    public void dibujarCirculo(int x, int y, int radio) {
        g2d.drawOval(x - radio, y - radio, 2 * radio, 2 * radio);
    }

    @Override
    public void dibujarLinea(int x1, int y1, int x2, int y2) {
        g2d.drawLine(x1, y1, x2, y2);
    }

    @Override
    public void dibujarTexto(String texto, int x, int y) {
        g2d.drawString(texto, x, y);
    }


}
