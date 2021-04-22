package com.company.ListaDoble;

import com.company.Dato;
import com.company.Pila.NodoDatoPila;
import com.company.Pila.Pila;

public class ListaDoble {

    NodoDatoLD cabeza;

    public void agregar_recursivo(Pila pila)
    {
        NodoDatoPila nodo_nuevo = pila.pop();
        if(nodo_nuevo != null)
        {
            agregar(nodo_nuevo.informacion);
            agregar_recursivo(pila);
        }
    }


    public void agregar(Dato nuevo_dato)
    {

        NodoDatoLD nodo_nuevo = new NodoDatoLD(nuevo_dato);

        if (vacia()) {
            cabeza = nodo_nuevo;
        } else {
            NodoDatoLD temp = cabeza;
            while (temp.nodo_siguiente != null) {
                temp = temp.nodo_siguiente;
            }
            temp.nodo_siguiente = nodo_nuevo;
            nodo_nuevo.nodo_siguiente = null;
            nodo_nuevo.nodo_anterior = temp;
        }
    }

    public boolean vacia()
    {
        return cabeza == null;
    }

    public int tamano()
    {
        int tamano = 0;

        if (!vacia()) {
            NodoDatoLD temp = cabeza;
            tamano = 1;
            while (temp.nodo_siguiente != null) {
                tamano++;
                temp = temp.nodo_siguiente;
            }
        }

        return tamano;
    }

    public NodoDatoLD buscar(String nombre_cancion)
    {
        NodoDatoLD encontrado = null;

        if (!vacia()){
            NodoDatoLD temp = cabeza;
            while (temp != null) {
                if (temp.informacion.nombre_cancion.equals(nombre_cancion.strip())) {
                    encontrado = temp;
                    break;
                }
                temp = temp.nodo_siguiente;
            }
        }
        return encontrado;
    }

    public Dato borrar(String nombre){
        NodoDatoLD nodo_a_borrar = buscar(nombre);
        if(nodo_a_borrar != null){
            if(nodo_a_borrar.nodo_anterior != null){
                nodo_a_borrar.nodo_anterior.nodo_siguiente = nodo_a_borrar.nodo_siguiente;
                if(nodo_a_borrar.nodo_siguiente != null){
                    nodo_a_borrar.nodo_siguiente.nodo_anterior = nodo_a_borrar.nodo_anterior;
                }
            }else{
                cabeza = cabeza.nodo_siguiente;
                if(cabeza != null){
                    cabeza.nodo_anterior = null;
                }
            }
        }

        return nodo_a_borrar.informacion;
    }

    @Override
    public String toString()
    {
        String datos = "";
        int cantidad = tamano();
        if(cantidad>0){
            NodoDatoLD temp = cabeza;
            for(int i=0; i<cantidad; i++){
                datos += temp.informacion.nombre_cancion +"-" + temp.informacion.nombre_artista + "-" + temp.informacion.anno + " ,";
                temp = temp.nodo_siguiente;
            }
        }
        else
        {
            return null;
        }
        return datos;
    }

}
