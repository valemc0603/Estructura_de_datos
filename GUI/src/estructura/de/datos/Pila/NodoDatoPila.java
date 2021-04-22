package estructura.de.datos.Pila;

import estructura.de.datos.Dato;

public class NodoDatoPila {
    public NodoDatoPila nodo_abajo = null;
    public Dato informacion;

    public NodoDatoPila(Dato informacion) {
        this.informacion = informacion;
    }
}
