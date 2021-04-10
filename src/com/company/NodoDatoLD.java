package com.company;

public class NodoDatoListaDoble {
    public NodoDatoListaDoble nodo_anterior;
    public NodoDatoListaDoble nodo_siguiente;
    public Dato informacion;

    public NodoDatoListaDoble(NodoDatoListaDoble nodo_anterior, NodoDatoListaDoble nodo_siguiente, Dato informacion) {
        this.nodo_anterior = nodo_anterior;
        this.nodo_siguiente = nodo_siguiente;
        this.informacion = informacion;
    }
}
