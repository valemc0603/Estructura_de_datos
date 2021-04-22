package estructura.de.datos.GUI_arbol;

import estructura.de.datos.Arbol.Arbol;

public class Controlador {
    private Dibujo objLienzo;
    private Arbol objArbol;

    public Controlador(Dibujo objLienzo, Arbol objArbol) {
        this.objLienzo = objLienzo;
        this.objArbol = objArbol;
    }
    
    public void iniciar() {
        objLienzo.setObjArbol(objArbol);
    }
}
