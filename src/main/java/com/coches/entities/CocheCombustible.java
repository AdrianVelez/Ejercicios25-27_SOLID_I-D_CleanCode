package com.coches.entities;

public class CocheCombustible extends Coche{
    String suministra= "Gasolina";
    private static int CONTADOR = 0;
    int idCombustible = 0;

    public CocheCombustible(String marca, String modelo, int puertas, int ruedas, String tipo) {
        super(marca, modelo, puertas, ruedas, tipo);
        idCombustible = ++CocheCombustible.CONTADOR;
    }

}
