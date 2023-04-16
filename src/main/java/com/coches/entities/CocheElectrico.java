package com.coches.entities;

public class CocheElectrico extends Coche{
    public String suministra;
    private static int CONTADOR = 0;
    int idElectrico = 0;

    public CocheElectrico(String marca, String modelo, int puertas, int ruedas, String tipo) {
        super(marca, modelo, puertas, ruedas, tipo);
        this.suministra="Electricidad";
        idElectrico = ++CocheElectrico.CONTADOR;
    }

}
