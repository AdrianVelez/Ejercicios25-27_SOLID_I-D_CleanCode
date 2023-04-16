package com.coches.repositories;

import com.coches.entities.Coche;

import java.util.ArrayList;

 public interface CochesDB {

    ArrayList<Coche> obtener();
    Coche buscar(Coche coche);
    void insertar(Coche coche);
    void borrar(Coche coche);

 }
