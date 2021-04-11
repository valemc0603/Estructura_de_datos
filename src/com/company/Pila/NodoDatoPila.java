package com.company.Pila;

import com.company.Dato;

public class NodoDatoPila {
    public NodoDatoPila nodo_abajo = null;
    public Dato informacion;

    public NodoDatoPila(Dato informacion) {
        this.informacion = informacion;
    }
}
