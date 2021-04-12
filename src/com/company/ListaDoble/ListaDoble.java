package com.company.ListaDoble;

public class ListaDoble {

    NodoDatoLD cabeza;

    public void agregar(NodoDatoLD nuevo) {
        if (vacia()) {
            cabeza = nuevo;
        } else {
            NodoDatoLD temp = cabeza;
            while (temp.nodo_siguiente != null) {
                temp = temp.nodo_siguiente;
            }
            temp.nodo_siguiente = nuevo;
            nuevo.nodo_siguiente = null;
            nuevo.nodo_anterior = temp;
        }
    }

    public boolean vacia() {
        return cabeza == null;
    }

    public int cantidad() {
        int cantidad = 0;

        if (!vacia()) {
            NodoDatoLD temp = cabeza;
            cantidad = 1;
            while (temp.nodo_siguiente != null) {
                cantidad++;
                temp = temp.nodo_siguiente;
            }
        }

        return cantidad;
    }

    public NodoDatoLD buscar(String nombre) {
        NodoDatoLD encontrado = null;

        if (!vacia()) {
            NodoDatoLD temp = cabeza;
            while (temp != null && encontrado == null) {
                if (temp.informacion.nombre.equals(nombre)) {
                    encontrado = temp;
                    break;
                }
                temp = temp.nodo_siguiente;
            }
        }
        return encontrado;
    }

    public boolean borrar(String nombre) {
        boolean borrado = false;

        NodoDatoLD aBorrar = buscar(nombre);
        if (aBorrar != null) {
            if (aBorrar.nodo_anterior != null) {
                aBorrar.nodo_anterior.nodo_siguiente = aBorrar.nodo_siguiente;
                if (aBorrar.nodo_siguiente != null) {
                    aBorrar.nodo_siguiente.nodo_anterior = aBorrar.nodo_anterior;
                }
            } else {
                cabeza = cabeza.nodo_siguiente;
                if (cabeza != null) {
                    cabeza.nodo_anterior = null;
                }
            }
            borrado = true;
        }

        return borrado;
    }

}

