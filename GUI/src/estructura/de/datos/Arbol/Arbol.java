package estructura.de.datos.Arbol;

import estructura.de.datos.ListaDoble.NodoDatoLD;

public class Arbol {

    public NodoArbol raiz;

    public boolean vacio() 
    {
        return raiz == null;
    }

    public void insertar(NodoDatoLD nuevo) 
    {
        NodoArbol nuevo_nodo = new NodoArbol(nuevo.informacion);
        
        if (vacio())
        {
            raiz = nuevo_nodo;
        }
        else
        {
            insertarRecursivo(raiz, nuevo_nodo);
        }
    }

    private void insertarRecursivo(NodoArbol subraiz, NodoArbol nuevo_nodo) 
    {
        if (nuevo_nodo.informacion.anno <= subraiz.informacion.anno) 
        {
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

    public String Usar_mostrar_Orden() 
    {
        if (vacio())
        {
            return "El Árbol está vacío.";
        }
        else
        {
            return Mostrar_Orden_Recursivo(raiz);
        }
    }

    private String Mostrar_Orden_Recursivo(NodoArbol subraiz) 
    {
        if (subraiz != null)
        {
            return Mostrar_Orden_Recursivo(subraiz.izquierdo) + subraiz.informacion.nombre_cancion + " - " +
                    subraiz.informacion.nombre_artista + " - " + subraiz.informacion.anno + " ," +
                    Mostrar_Orden_Recursivo(subraiz.derecho);
        }
        else
        {
            return "";
        }
    }


}
