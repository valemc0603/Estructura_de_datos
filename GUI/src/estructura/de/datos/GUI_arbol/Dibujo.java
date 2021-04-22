package estructura.de.datos.GUI_arbol;

import java.awt.Graphics;
import javax.swing.JPanel;
import estructura.de.datos.Arbol.Arbol;
import estructura.de.datos.Arbol.NodoArbol;

public class Dibujo extends JPanel {
    private Arbol objArbol;
    public static final int DIAMETRO = 5;
    public static final int RADIO = DIAMETRO / 2;
    public static final int ANCHO = 50;

    public void setObjArbol(Arbol objArbol) 
    {
        this.objArbol = objArbol;
        repaint();
    }

    @Override
    public void paint(Graphics g) 
    {
        super.paint(g); 
        pintar(g, getWidth() / 2, 20, objArbol.raiz);
    }
    
    private void pintar(Graphics g, int x, int y, NodoArbol n) 
    {
        if (n == null)
        {
            
        }
        
        else 
        {
            int EXTRA = n.nodosCompletos(n) * 60;
            g.drawOval(x, y, DIAMETRO, DIAMETRO);
            g.drawString(n.toString(), x - 50, y);
            if (n.izquierdo != null)
                g.drawLine(x + RADIO, y + RADIO, x -ANCHO - EXTRA + RADIO - 50, y + ANCHO + RADIO);
            if (n.derecho != null)
                g.drawLine(x + RADIO, y + RADIO, x +ANCHO + EXTRA + RADIO + 50, y + ANCHO + RADIO);
            pintar(g, x - ANCHO - EXTRA - 50, y + ANCHO, n.izquierdo);
            pintar(g, x + ANCHO + EXTRA + 50, y + ANCHO, n.derecho);
        }
    }
}
