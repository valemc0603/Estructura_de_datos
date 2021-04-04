package com.company;

public class Pila {
    private NodoDato top = null;

    public boolean vacio(){
        return top == null;
    }

    public void push(NodoDato nuevo_nodo){
        nuevo_nodo.nodo_abajo = top;
        top = nuevo_nodo;
    }

    public NodoDato pop(){
        NodoDato top_viejo = top;
        if(top != null){
            top = top.nodo_abajo;
        }
        return top_viejo;
    }
}
