package com.company.Arbol;

import com.company.Dato;

public class Arbol {

    public NodoArbol raiz;

    public boolean vacio() {
        return raiz == null;
    }

    public void insertar(Dato dato) {
        NodoArbol nuevo_nodo = new NodoArbol(dato);
        if (vacio())
        {
            raiz = nuevo_nodo;
        }
        else
        {
            insertarRecursivo(raiz, nuevo_nodo);
        }
    }

    private void insertarRecursivo(NodoArbol subraiz, NodoArbol nuevo_nodo) {
        if (nuevo_nodo.informacion.anno <= subraiz.informacion.anno) {
            if (subraiz.izquierdo == null)
            {
                subraiz.izquierdo = nuevo_nodo;
            }
            else
            {
                insertarRecursivo(subraiz.izquierdo, nuevo_nodo);
            }
        } else {

            if (subraiz.derecho == null)
            {
                subraiz.derecho = nuevo_nodo;
            }
            else
            {
                insertarRecursivo(subraiz.derecho, nuevo_nodo);
            }
        }
    }

    public String inOrden() {
        if (vacio())
        {
            return "El Árbol está vacío.";
        }
        else
        {
            return inOrdenRecursivo(raiz);
        }
    }

    private String inOrdenRecursivo(NodoArbol subRaiz) {
        if (subRaiz != null) {
            return inOrdenRecursivo(subRaiz.izquierdo) + subRaiz.informacion.nombre_cancion + " - " +
                    subRaiz.informacion.nombre_artista + " - " + subRaiz.informacion.anno + " ," +
                    inOrdenRecursivo(subRaiz.derecho);
        }
        else
        {
            return "";
        }
    }


}
