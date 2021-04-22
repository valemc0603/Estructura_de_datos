package estructura.de.datos.Pila;

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
    
    public String mostrar()
    {
        String resultado="";
        if(vacio())
        {
            return null;
        }
        else
        {
            NodoDatoPila actual = top;
            while(actual != null)
            {
                resultado += actual.informacion.nombre_cancion +"-" + actual.informacion.nombre_artista + "-" + actual.informacion.anno + " ,";
                actual = actual.nodo_abajo;
            }
        }
        return resultado;
    }
    

}
