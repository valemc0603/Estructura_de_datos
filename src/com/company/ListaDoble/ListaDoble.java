package com.company.ListaDoble;

import com.company.Dato;
import com.company.Pila.NodoDatoPila;
import com.company.Pila.Pila;

public class ListaDoble {

    NodoDatoLD cabeza;

    public void agregar_recursivo(Pila nuevo_nodo)
    {
        NodoDatoPila nodo_nuevo = nuevo_nodo.pop();
        if(nodo_nuevo != null)
        {
            agregar(nodo_nuevo.informacion);
            agregar_recursivo(nuevo_nodo);
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

    public NodoDatoLD buscar(String nombre)
    {
        NodoDatoLD encontrado = null;

        if (!vacia()) {
            NodoDatoLD temp = cabeza;
            while (temp != null) {
                if (temp.informacion.nombre.equals(nombre)) {
                    encontrado = temp;
                    break;
                }
                temp = temp.nodo_siguiente;
            }
        }
        return encontrado;
    }

    public String[] toArray()
    {
        String[] datos = new String[0];
        int cantidad = tamano();
        if(cantidad>0){
            datos = new String[cantidad];
            NodoDatoLD temp = cabeza;
            for(int i=0; i<cantidad; i++){
                datos[i] = temp.informacion.nombre;
                temp = temp.nodo_siguiente;
            }
        }
        return datos;
    }

}
