package com.company;

public class NodoDato {
    public NodoDato nodo_abajo = null;
    public Dato informacion;

    public NodoDato(Dato informacion) {
        this.informacion = informacion;
    }
}
