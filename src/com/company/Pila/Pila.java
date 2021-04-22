package com.company.Pila;

import com.company.Dato;
import com.company.ListaDoble.NodoDatoLD;

public class Pila {
    private NodoDatoPila top = null;

    public boolean vacio()
    {
        return top == null;
    }

    public void push(NodoDatoPila nuevo_nodo)
    {
        nuevo_nodo.nodo_abajo = top;
        top = nuevo_nodo;
    }

    public NodoDatoPila pop()
    {
        NodoDatoPila top_viejo = top;
        if(top != null){
            top = top.nodo_abajo;
        }
        return top_viejo;
    }
    
    public String mostrar(){
        String resultado="";
        if(vacio())
        {
            return null;
        }
        else
        {
            NodoDatoPila actual = top;
            //Recorrer la pila es moverse de nodo en nodo hasta el primero que se inserto
            while(actual != null)
            {
                resultado += actual.informacion.nombre_cancion +"-" + actual.informacion.nombre_artista + "-" + actual.informacion.anno + " ,";
                actual = actual.nodo_abajo;
            }
        }
        return resultado;
    }
    

}
