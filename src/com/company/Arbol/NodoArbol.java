package com.company.Arbol;

import com.company.Dato;


public class NodoArbol {

    public NodoArbol izquierdo;
    public NodoArbol derecho;
    public Dato informacion;

    public NodoArbol(Dato informacion) {
        this.informacion = informacion;
    }

    public int nodosCompletos(NodoArbol n) 
    {
        if (n == null)
        {
            return 0;
        }  
        else 
        {
            if (n.izquierdo != null && n.derecho != null)
                return nodosCompletos(n.izquierdo) + nodosCompletos(n.derecho) + 1;
            return nodosCompletos(n.izquierdo) + nodosCompletos(n.derecho);
        }
    }
    
    @Override
    public String toString()
    {
        return informacion.nombre_cancion + ", " + informacion.nombre_artista + ", " + informacion.anno;
    }
}
