package com.coches.entities;


public class Coche {
    private static int CONTADOR = 0;
    int id = 0;
    private String marca;
    private String modelo;
    private int puertas;
    private int ruedas;
    private String tipo;

    public Coche(){
    }

    public Coche(String marca, String modelo, int puertas, int ruedas, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.puertas = puertas;
        this.ruedas = ruedas;
        this.tipo = tipo;
        this.id = ++Coche.CONTADOR;
    }

    public int getId() {
        return this.id;
    }
    public String getMarca() {return marca;}
    public String getModelo() {return modelo;}
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public int getPuertas() {
        return puertas;
    }
    public int getRuedas() {
        return ruedas;
    }
    public String getTipo() {
        return tipo;
    }


    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", puertas=" + puertas +
                ", ruedas=" + ruedas +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}

