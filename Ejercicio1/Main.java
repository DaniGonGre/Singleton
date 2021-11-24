package com.dam1;

public class Main {

    public static void main(String[] args) {
        Singleton miUnicaInstancia = Singleton.getInstance();
        miUnicaInstancia.setEdad(23);
        miUnicaInstancia.setNombre("Peter");

        Singleton otraInstanciaLaMisma = Singleton.getInstance();
        otraInstanciaLaMisma.setEdad(54);
}
