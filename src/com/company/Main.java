package com.company;

import com.company.Pila.NodoDatoPila;
import com.company.Pila.Pila;
import com.company.ListaDoble.ListaDoble;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Pila pila = new Pila();
        pila.push(new NodoDatoPila(new Dato("Cancion1", "Morales",1998)));
        pila.push(new NodoDatoPila(new Dato("Cancion2","Jona",1998)));
        pila.push(new NodoDatoPila(new Dato("Cancion3","Nara",2002)));

        ListaDoble lista = new ListaDoble();

        lista.agregar_recursivo(pila);

        System.out.println(lista.toString());
    }
}
