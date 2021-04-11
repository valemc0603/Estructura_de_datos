package com.company.ListaDoble;

import com.company.Dato;

public class NodoDatoLD {
    public NodoDatoLD nodo_anterior;
    public NodoDatoLD nodo_siguiente;
    public Dato informacion;

    public NodoDatoLD(NodoDatoLD nodo_anterior, NodoDatoLD nodo_siguiente, Dato informacion) {
        this.nodo_anterior = nodo_anterior;
        this.nodo_siguiente = nodo_siguiente;
        this.informacion = informacion;
    }
}
