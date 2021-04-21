package com.company;

import com.company.ListaDoble.ListaDoble;
import com.company.Pila.NodoDatoPila;
import com.company.Pila.Pila;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Pila pila = new Pila();
        pila.push(new NodoDatoPila(new Dato("Salchicha")));
        pila.push(new NodoDatoPila(new Dato("repollo")));
        pila.push(new NodoDatoPila(new Dato("salsa de tomate")));
        pila.push(new NodoDatoPila(new Dato("mayonesa")));

        ListaDoble lista = new ListaDoble();

        lista.agregar_recursivo(pila);

        System.out.println(Arrays.toString(lista.aArregloString()));
    }
}
