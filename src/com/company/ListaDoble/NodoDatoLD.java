package com.company.ListaDoble;

import com.company.Dato;

public class NodoDatoLD {
    public NodoDatoLD nodo_anterior;
    public NodoDatoLD nodo_siguiente;
    public Dato informacion;

    public NodoDatoLD(Dato informacion) {
        this.informacion = informacion;
    }

}
