package com.company.Pila;

import com.company.Dato;

public class Pila {
    private NodoDatoPila top = null;



    public boolean vacio(){
        return top == null;
    }

    public void push(NodoDatoPila nuevo_nodo){
        nuevo_nodo.nodo_abajo = top;
        top = nuevo_nodo;
    }

    public NodoDatoPila pop(){
        NodoDatoPila top_viejo = top;
        if(top != null){
            top = top.nodo_abajo;
        }
        return top_viejo;
    }
}
