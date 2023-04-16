package com.coches.entities;

public class CocheHibrido extends Coche{
    String suministra="Mixto";
    private static int CONTADOR = 0;
    int idHibrido = 0;

    public CocheHibrido(String marca, String modelo, int puertas, int ruedas, String tipo) {
        super(marca, modelo, puertas, ruedas, tipo);
        idHibrido = ++CocheHibrido.CONTADOR;
    }


}